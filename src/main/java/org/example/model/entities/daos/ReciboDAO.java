package org.example.model.entities.daos;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.example.model.entities.models.Cliente;
import org.example.model.entities.models.Cocinero;
import org.example.model.entities.models.Recibo;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.mongodb.client.model.Filters.lte;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;

public class ReciboDAO {

    private MongoCollection<Recibo> recibos;

    public ReciboDAO(BaseDAO base){

        this.recibos = base.db.getCollection("Recibos", Recibo.class);

    }

    public void buscarRecibosDe17oMenos(){

        try {
            ArrayList<Recibo> recibosConsultados = new ArrayList<>();
            recibos.find(lte("importe", 17)).projection(Projections.exclude("cocineroId", "compradorId")).into(recibosConsultados);


            System.out.println("BUSCAMOS TODOS LOS RECIBOS CON UN IMPORTE IGUAL O MENOR A 17 EUROS OCULTANDO LOS ID DE LOS COCINEROS Y COMPRADORES");
            for (Recibo r : recibosConsultados) {
                System.out.println(r.toString());
            }
        }catch (Exception e){
            System.out.println("Error detectado en buscar(): "+e);
        }

    }


    public void actualizarFecha(){
        recibos.updateOne(
                Filters.eq("_id", new ObjectId("6407b0c3c1d2b22958306a47")),
                combine(set("fecha", "28/08/2022")));

        System.out.println("ACTUALIZAMOS LA FECHA DE UN RECIBO");
    }

    public void actualizarCocinero(){
        recibos.updateOne(
                Filters.eq("_id", new ObjectId("6407b0c3c1d2b22958306a4a")),
                combine(set("cocineroid", new ObjectId("6407b0c3c1d2b22958306a0e"))));

        System.out.println("ACTUALIZAMOS EL COCINERO QUE HAYA IMPUESTO UN RECIBO");
    }




    public void exportar(){

        try {



            ObjectMapper mapeador = new ObjectMapper();
            // Recorro la colección completa y añado línea a línea:
            List<Recibo> consulta = recibos.find()
                    .into(new ArrayList<Recibo>());

            File fichero = new
                    File("src\\main\\resources\\ficheroRecibos.json");


            mapeador.writeValue(fichero, consulta);


            // Cierro el archivo:
        } catch (Exception e){
            System.out.println(e);
        }
    }


}

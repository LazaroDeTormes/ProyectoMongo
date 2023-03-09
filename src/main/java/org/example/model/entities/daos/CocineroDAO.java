package org.example.model.entities.daos;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Indexes;
import com.mongodb.client.model.Projections;
import org.bson.types.ObjectId;
import org.example.model.entities.models.Cliente;
import org.example.model.entities.models.Coche;
import org.example.model.entities.models.Cocinero;
import org.example.model.entities.models.Plato;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;

public class CocineroDAO extends BaseDAO{

    private MongoCollection<Cocinero> cocineros;


    public CocineroDAO(){

        this.cocineros = db.getCollection("Cocineros", Cocinero.class);
    }

    public void buscarTodosLosCocineros(){

        try {



            ArrayList<Cocinero> cocinerosConsultados = new ArrayList<>();
            cocineros.find().sort(Indexes.descending("nombre")).into(cocinerosConsultados);



            System.out.println("BUSCAMOS LOS COCINEROS EN SU TOTALIDAD ORDENANDO ALFABÉTICAMENTE DE MANERA DESCENDENTE POR EL NOMBRE");
            for (Cocinero c : cocinerosConsultados) {
                System.out.println(c.toString());
            }
        }catch (Exception e){
            System.out.println("Error detectado en buscar(): "+e);
        }

    }




    public void exportar(){

        try {



            ObjectMapper mapeador = new ObjectMapper();
            // Recorro la colección completa y añado línea a línea:
            List<Cocinero> consulta = cocineros.find()
                    .into(new ArrayList<Cocinero>());

            File fichero = new
                    File("src\\main\\resources\\ficheroCocineros.json");


            mapeador.writeValue(fichero, consulta);


            // Cierro el archivo:
        } catch (Exception e){
            System.out.println(e);
        }
    }



    public void actualizarRecibo(){

        cocineros.updateOne(
                Filters.eq("_id", new ObjectId("6407b0c3c1d2b22958306a5b")),
                combine(set("reciboid", new ObjectId("6407b0c3c1d2b22958306a24"))));

        System.out.println("ACTUALIZAMOS EL RECIBO IMPUESTO DE UN COCINERO");

    }

}

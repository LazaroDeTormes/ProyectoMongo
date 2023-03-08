package org.example.model.entities.daos;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.Block;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.*;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.example.model.entities.models.Cliente;
import org.example.model.entities.models.Coche;
import org.example.model.entities.models.Plato;
import org.example.model.entities.models.Recibo;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.mongodb.client.model.Accumulators.sum;
import static com.mongodb.client.model.Aggregates.group;

public class PlatoDAO {

    private MongoCollection<Plato> platos;

    public PlatoDAO(BaseDAO base){

        this.platos = base.db.getCollection("Platos", Plato.class);

    }

    public void buscarPorPrecio(){

        try {
            ArrayList<Plato> platosConsultados = new ArrayList<>();
            platos.find(Filters.and(Filters.gte("precio", 20), Filters.lte("precio", 139))).sort(Indexes.ascending("nombre"))
                    .projection(Projections.exclude("_id")).into(platosConsultados);


            System.out.println("BUSCAMOS LOS PLATOS QUE CUESTEN ENTRE 20 Y 139 EUROS Y LOS ORDENAMOS POR ORDEN ALFABÉTICO ASCENDENTE POR LOS NOMBRES");
            for (Plato p : platosConsultados) {
                System.out.println(p.toString());
            }
        }catch (Exception e){
            System.out.println("Error detectado en buscarPorPrecio(): "+e);
        }

    }

    public void agrupacion(){



        platos.aggregate(List.of(
                group("$tipo"))
        ).forEach(printBlock);

    }


    public static Block<Plato> printBlock = new Block<Plato>() {
        @Override
        public void apply(final Plato plato) {
            System.out.println(plato.toString());
        }
    };




    public void exportar(){

        try {



            ObjectMapper mapeador = new ObjectMapper();
            // Recorro la colección completa y añado línea a línea:
            List<Plato> consulta = platos.find()
                    .into(new ArrayList<Plato>());

            File fichero = new
                    File("C:\\Users\\Alex\\OneDrive\\Documentos\\CLASE\\ProyectoMongo\\ficheroPlatos.json");


            mapeador.writeValue(fichero, consulta);


            // Cierro el archivo:
        } catch (Exception e){
            System.out.println(e);
        }
    }


}

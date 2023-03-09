package org.example.model.entities.daos;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
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

import javax.swing.*;
import java.io.File;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.mongodb.client.model.Accumulators.sum;
import static com.mongodb.client.model.Aggregates.group;
import static com.mongodb.client.model.Aggregates.unwind;

public class PlatoDAO extends BaseDAO {

    private final MongoCollection<Plato> platos;

    public PlatoDAO() {
        this.platos = db.getCollection("Platos", Plato.class);
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

        System.out.println("AGRUPAMOS LOS PLATOS POR TIPO");
        db.getCollection("Platos").aggregate(List.of(
                group("$tipo")
        )).forEach(System.out::println);

        System.out.println("");


    }

    public void agrupacionSuma(){

        System.out.println("AGRUPAMOS LOS PLATOS POR TIPO Y CALCULAMOS EL PRECIO TOTAL DE TODOS LOS DE CADA TIPO");
        db.getCollection("Platos").aggregate(List.of(
                group("$tipo", Accumulators.sum("totalprecio", "$precio"))
        )).forEach(System.out::println);

        System.out.println("");
    }







    public void exportar(){

        try {



            ObjectMapper mapeador = new ObjectMapper()
                    .configure(SerializationFeature.INDENT_OUTPUT, true);
            List<Plato> consulta = platos.find()
                    .into(new ArrayList<Plato>());





            File fichero = new File("src\\main\\resources\\ficheroPlatos.json");


            mapeador.writeValue(fichero, consulta);


        } catch (Exception e){
            System.out.println(e);
        }
    }


}

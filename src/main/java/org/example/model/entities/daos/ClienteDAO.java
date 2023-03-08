package org.example.model.entities.daos;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.*;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.io.BsonOutput;
import org.bson.types.ObjectId;
import org.example.model.entities.models.Cliente;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.mongodb.client.model.Aggregates.*;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;

public class ClienteDAO{

    private MongoCollection<Cliente> clientes;

    public ClienteDAO(BaseDAO base){
        this.clientes = base.db.getCollection("Clientes", Cliente.class);
    }

    public void buscarCarlos(){
        try {
            ArrayList<Cliente> clientesConsultados = new ArrayList<>();
            clientes.find(eq("nombre", "Carlos")).sort(Indexes.ascending("apellidos"))
                    .projection(Projections.exclude("_id", "fecha", "reciboId")).into(clientesConsultados);


            System.out.println("BUSCAMOS LOS CIENTES LLAMADOS CARLOS Y LOS ORDENAMOS POR ORDEN ALFABÉTICO POR LOS APELLIDOS");
            for (Cliente c : clientesConsultados) {
                System.out.println(c.toString());
            }
        }catch (Exception e){
            System.out.println("Error detectado en buscarCarlos(): "+e);
        }
    }

    public void buscar1980(){
        try {
            ArrayList<Cliente> clientesConsultados = new ArrayList<>();
            clientes.find(Filters.lt("fecha", "1980")).sort(Indexes.ascending("nombre"))
                    .projection(Projections.exclude("_id", "reciboId")).into(clientesConsultados);


            System.out.println("BUSCAMOS LOS CIENTES NACIDOS ANTES DE 1980 Y LOS ORDENAMOS POR ORDEN ALFABÉTICO POR EL NOMBRE");
            for (Cliente c : clientesConsultados) {
                System.out.println(c.toString());
            }
        }catch (Exception e){
            System.out.println("Error detectado en buscar1980(): "+e);
        }
    }



    public void actualizarCorreoAlonso(){

        try{

            clientes.updateOne(
                    Filters.eq("apellidos", "Alonso Díaz"),
                    combine(set("correo", "correoCambiado@gmail.com")));

            System.out.println("ACTUALIZAMOS EL CORREO DE FERNAQNDO ALONSO DÍAZ");


        }catch (Exception e){
            System.out.println(e);
        }

    }

    public void actualizarAnho(){

        try{

            clientes.updateOne(
                    Filters.eq("_id", new ObjectId("6407b0c3c1d2b22958306a3c")),
                    combine(set("fecha", "1951")));

            System.out.println("ACTUALIZAMOS EL AÑO DE NACIMIENTO DE UN CLIENTE");


        }catch (Exception e){
            System.out.println(e);
        }

    }





    public void agrupacion(){



        AggregateIterable<Cliente> iterable = clientes.aggregate(Arrays.asList(

                Aggregates.group("$fecha",
                        Accumulators.sum("totalrecibos",
                                Arrays.asList("$reciboid"))))

        );

        for (Cliente c : iterable) {
            System.out.println(c);
        }

    }




    public void exportar(){

        try {



            ObjectMapper mapeador = new ObjectMapper();
            // Recorro la colección completa y añado línea a línea:
            List<Cliente> consulta = clientes.find()
                    .into(new ArrayList<Cliente>());

            File fichero = new
                    File("C:\\Users\\Alex\\OneDrive\\Documentos\\CLASE\\ProyectoMongo\\ficheroClientes.json");


            mapeador.writeValue(fichero, consulta);


            // Cierro el archivo:
        } catch (Exception e){
            System.out.println(e);
        }
    }

}

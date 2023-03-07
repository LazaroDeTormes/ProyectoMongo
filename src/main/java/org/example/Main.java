package org.example;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Indexes;
import com.mongodb.client.model.Projections;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.example.model.entities.Cliente;
import org.example.model.entities.Conexion;
import org.example.model.entities.Creacion;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;


public class Main {
    public static void main(String[] args) {

        try {



            MongoClient cliente = new MongoClient("localhost", 27017);

            CodecRegistry codecRegistry = CodecRegistries.fromRegistries(
                    MongoClientSettings.getDefaultCodecRegistry(),
                    CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build())
            );

            MongoDatabase db = cliente.getDatabase("ProyectoUD5").withCodecRegistry(codecRegistry);



            Creacion.creacion(db);

            MongoCollection<Document> clientes = db.getCollection("Clientes");


            Document d = clientes.find(Filters.eq("nombre","Fernando")).first();

            System.out.println(d.toJson());


            try {

                MongoCursor<Document> cursor = clientes
                        .find(Filters.eq("nombre", "Carlos")).sort(Indexes.ascending("apellidos"))
                        .projection(Projections.exclude("id", "fecha", "reciboId")).iterator();

                while (cursor.hasNext()) {
                    Document document = cursor.next();
                    String json = document.toJson();
                    System.out.println(json);
                }

            }catch (Exception e){
                System.out.println(e);
            }


        } catch (Exception e){
            System.out.println(e);
        }

    }
}
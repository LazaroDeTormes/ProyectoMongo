package org.example;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
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
            assert d != null;
            System.out.println(d.toJson());





        } catch (Exception e){
            System.out.println(e);
        }

    }
}
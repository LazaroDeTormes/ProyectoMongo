package org.example;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
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

            MongoClient cliente = new MongoClient("127.0.0.1", 27017);

            MongoDatabase db = cliente.getDatabase("ProyectoUD5");


            Creacion.creacion(db);

            MongoCollection<Document> clientes = db.getCollection("clientes");


            Document d = clientes.find(Filters.eq("nombre","Fernando")).first();
            assert d != null;
            System.out.println(d.toJson());





        } catch (Exception e){
            System.out.println(e);
        }

    }
}
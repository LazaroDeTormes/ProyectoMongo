package org.example.model.entities;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Conexion {
    public void conexion(){


        try {
            MongoClient cliente = new MongoClient("127.0.0.1", 27017);

            MongoDatabase db = cliente.getDatabase("ProyectoUD5");

            MongoCollection<Document> platos = db.getCollection("platos");

            MongoCollection<Document> cocineros = db.getCollection("cocineros");

            MongoCollection<Document> coches = db.getCollection("coches");

            MongoCollection<Document> clientes = db.getCollection("clientes");

            MongoCollection<Document> recibos = db.getCollection("recibos");

            Document a = new Document();

        } catch (Exception e){
            System.out.println(e);
        }


    }


}

package org.example;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class Main {
    public static void main(String[] args) {

        try {
            MongoClient cliente = new MongoClient("127.0.0.1", 27017);

            MongoDatabase db = cliente.getDatabase("ProyectoUD5");

            MongoCollection<Document> platos = db.getCollection("platos");





        } catch (Exception e){
            System.out.println(e);
        }

    }
}
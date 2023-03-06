package org.example;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.example.model.entities.Conexion;
import org.example.model.entities.Creacion;


public class Main {
    public static void main(String[] args) {

        try {
            Conexion.conexion();

            Creacion.creacion();





        } catch (Exception e){
            System.out.println(e);
        }

    }
}
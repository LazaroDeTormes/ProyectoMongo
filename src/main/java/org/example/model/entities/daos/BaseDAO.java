package org.example.model.entities.daos;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.example.model.entities.Creacion;

public class BaseDAO {

    protected CodecRegistry codecRegistry;

    protected MongoClient cliente;

    protected static MongoDatabase db;

    public BaseDAO(){
        if (db == null) {
            this.codecRegistry = CodecRegistries.fromRegistries(
                    MongoClientSettings.getDefaultCodecRegistry(),
                    CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build())
            );

            this.cliente = MongoClients.create("mongodb://localhost:27017");
            db = cliente.getDatabase("ProyectoUD5").withCodecRegistry(codecRegistry);
        }


    }

    public void crearTablas(){
        db.drop();
        Creacion.creacion(db);
    }

}

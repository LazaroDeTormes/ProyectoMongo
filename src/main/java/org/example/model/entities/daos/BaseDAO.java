package org.example.model.entities.daos;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.example.model.entities.Creacion;

public class BaseDAO {

    protected CodecRegistry codecRegistry;

    protected MongoClient cliente;

    protected MongoDatabase db;
    public BaseDAO(){

        this.codecRegistry = CodecRegistries.fromRegistries(
                MongoClientSettings.getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build())
        );

        this.cliente = new MongoClient("localhost", MongoClientOptions.builder().codecRegistry(codecRegistry).build());
        this.db = cliente.getDatabase("ProyectoUD5").withCodecRegistry(codecRegistry);
    }

    public void crearTablas(){

        Creacion.creacion(db);
    }

}

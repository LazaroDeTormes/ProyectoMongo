package org.example;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Indexes;
import com.mongodb.client.model.Projections;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.example.model.entities.daos.*;
import org.example.model.entities.models.*;

import java.util.ArrayList;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;


public class Main {
    public static void main(String[] args) {

        try {
            BaseDAO baseDAO = new BaseDAO();
            ClienteDAO clienteDAO = new ClienteDAO(baseDAO);
            CocheDAO cocheDAO = new CocheDAO(baseDAO);
            PlatoDAO platoDAO = new PlatoDAO(baseDAO);
            CocineroDAO cocineroDAO = new CocineroDAO(baseDAO);
            ReciboDAO reciboDAO = new ReciboDAO(baseDAO);


//===============================================BÚSQUEDAS==============================================================================

            //BUSCAMOS LOS CIENTES LLAMADOS CARLOS Y LOS ORDENAMOS POR ORDEN ALFABÉTICO POR LOS APELLIDOS
            clienteDAO.buscarCarlos();
            System.out.println("");

            //BUSCAMOS LOS CIENTES NACIDOS ANTES DE 1980 Y LOS ORDENAMOS POR ORDEN ALFABÉTICO POR EL NOMBRE
            clienteDAO.buscar1980();
            System.out.println("");

            //BUSCAMOS LOS COCHES QUE SEAN MERCEDES BENZ Y LOS ORDENAMOS POR ORDEN ALFABÉTICO DESCENDENTE POR LAS MATRÍCULAS
            cocheDAO.buscarMercedesBenz();
            System.out.println("");

            //BUSCAMOS LOS PLATOS QUE CUESTEN ENTRE 20 Y 139 EUROS Y LOS ORDENAMOS POR ORDEN ALFABÉTICO ASCENDENTE POR LOS NOMBRES
            platoDAO.buscarPorPrecio();
            System.out.println("");

            //BUSCAMOS LOS COCINEROS EN SU TOTALIDAD ORDENANDO ALFABÉTICAMENTE DE MANERA DESCENDENTE POR EL NOMBRE
            cocineroDAO.buscarTodosLosCocineros();
            System.out.println("");

            //BUSCAMOS TODOS LOS RECIBOS CON UN IMPORTE IGUAL O MENOR A 17 EUROS OCULTANDO LOS ID DE LOS COCINEROS Y COMPRADORES
            reciboDAO.buscarRecibosDe17oMenos();
            System.out.println("");

//======================================================ACTUALIZACIONES==============================================================================







        } catch (Exception e){
            System.out.println(e);
        }

    }
}
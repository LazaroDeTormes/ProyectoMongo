package org.example.model.entities.daos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Indexes;
import com.mongodb.client.model.Projections;
import org.example.model.entities.models.Coche;
import org.example.model.entities.models.Cocinero;
import org.example.model.entities.models.Plato;

import java.util.ArrayList;

import static com.mongodb.client.model.Filters.eq;

public class CocineroDAO {

    private MongoCollection<Cocinero> cocineros;


    public CocineroDAO(BaseDAO base){

        this.cocineros = base.db.getCollection("Cocineros", Cocinero.class);
    }

    public void buscarTodosLosCocineros(){

        try {



            ArrayList<Cocinero> cocinerosConsultados = new ArrayList<>();
            cocineros.find().sort(Indexes.descending("nombre")).into(cocinerosConsultados);



            System.out.println("BUSCAMOS LOS COCINEROS EN SU TOTALIDAD ORDENANDO ALFABÉTICAMENTE DE MANERA DESCENDENTE POR EL NOMBRE");
            for (Cocinero c : cocinerosConsultados) {
                System.out.println(c.toString());
            }
        }catch (Exception e){
            System.out.println("Error detectado en buscar(): "+e);
        }

    }

}

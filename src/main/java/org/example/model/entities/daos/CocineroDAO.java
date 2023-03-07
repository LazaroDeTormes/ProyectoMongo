package org.example.model.entities.daos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Indexes;
import com.mongodb.client.model.Projections;
import org.example.model.entities.models.Cocinero;
import org.example.model.entities.models.Plato;

import java.util.ArrayList;

public class CocineroDAO {

    private MongoCollection<Cocinero> cocineros;

    public CocineroDAO(BaseDAO base){

        this.cocineros = base.db.getCollection("Cocineros", Cocinero.class);

    }

    public void buscar(){

        try {
            ArrayList<Cocinero> cocinerosConsultados = new ArrayList<>();
            cocineros.find();


            System.out.println("BUSCAMOS ");
            for (Cocinero c : cocinerosConsultados) {
                System.out.println(c.toString());
            }
        }catch (Exception e){
            System.out.println("Error detectado en buscar(): "+e);
        }

    }

}

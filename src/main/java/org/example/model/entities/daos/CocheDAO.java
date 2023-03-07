package org.example.model.entities.daos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Indexes;
import com.mongodb.client.model.Projections;
import org.example.model.entities.models.Cliente;
import org.example.model.entities.models.Coche;

import java.util.ArrayList;

public class CocheDAO{

    private MongoCollection<Coche> coches;

    public CocheDAO(BaseDAO base){

        this.coches = base.db.getCollection("Coches", Coche.class);

    }

    public void buscarMercedesBenz(){

        try {
            ArrayList<Coche> cochesConsultados = new ArrayList<>();
            coches.find(Filters.eq("modelo", "Mercedes Benz")).sort(Indexes.descending("matricula"))
                    .projection(Projections.exclude("_id", "conductorId")).into(cochesConsultados);


            System.out.println("BUSCAMOS LOS COCHES QUE SEAN MERCEDES BENZ Y LOS ORDENAMOS POR ORDEN ALFABÉTICO DESCENDENTE POR LAS MATRÍCULAS");
            for (Coche c : cochesConsultados) {
                System.out.println(c.toString());
            }
        }catch (Exception e){
            System.out.println("Error detectado en buscarMercedesBenz(): "+e);
        }

    }

}

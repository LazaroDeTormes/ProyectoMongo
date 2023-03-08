package org.example.model.entities.daos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Indexes;
import com.mongodb.client.model.Projections;
import org.example.model.entities.models.Coche;
import org.example.model.entities.models.Plato;

import java.util.ArrayList;

public class PlatoDAO {

    private MongoCollection<Plato> platos;

    public PlatoDAO(BaseDAO base){

        this.platos = base.db.getCollection("Platos", Plato.class);

    }

    public void buscarPorPrecio(){

        try {
            ArrayList<Plato> platosConsultados = new ArrayList<>();
            platos.find(Filters.and(Filters.gte("precio", 20), Filters.lte("precio", 139))).sort(Indexes.ascending("nombre"))
                    .projection(Projections.exclude("_id")).into(platosConsultados);


            System.out.println("BUSCAMOS LOS PLATOS QUE CUESTEN ENTRE 20 Y 139 EUROS Y LOS ORDENAMOS POR ORDEN ALFABÉTICO ASCENDENTE POR LOS NOMBRES");
            for (Plato p : platosConsultados) {
                System.out.println(p.toString());
            }
        }catch (Exception e){
            System.out.println("Error detectado en buscarPorPrecio(): "+e);
        }

    }


}

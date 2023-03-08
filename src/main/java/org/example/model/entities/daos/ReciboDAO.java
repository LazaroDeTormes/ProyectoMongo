package org.example.model.entities.daos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Projections;
import org.example.model.entities.models.Cocinero;
import org.example.model.entities.models.Recibo;

import java.util.ArrayList;

import static com.mongodb.client.model.Filters.lte;

public class ReciboDAO {

    private MongoCollection<Recibo> recibos;

    public ReciboDAO(BaseDAO base){

        this.recibos = base.db.getCollection("Recibos", Recibo.class);

    }

    public void buscarRecibosDe17oMenos(){

        try {
            ArrayList<Recibo> recibosConsultados = new ArrayList<>();
            recibos.find(lte("importe", 17)).projection(Projections.exclude("cocineroId", "compradorId")).into(recibosConsultados);


            System.out.println("BUSCAMOS TODOS LOS RECIBOS CON UN IMPORTE IGUAL O MENOR A 17 EUROS OCULTANDO LOS ID DE LOS COCINEROS Y COMPRADORES");
            for (Recibo r : recibosConsultados) {
                System.out.println(r.toString());
            }
        }catch (Exception e){
            System.out.println("Error detectado en buscar(): "+e);
        }

    }


}

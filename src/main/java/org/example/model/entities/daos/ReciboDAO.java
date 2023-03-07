package org.example.model.entities.daos;

import com.mongodb.client.MongoCollection;
import org.example.model.entities.models.Cocinero;
import org.example.model.entities.models.Recibo;

import java.util.ArrayList;

public class ReciboDAO {

    private MongoCollection<Recibo> recibos;

    public ReciboDAO(BaseDAO base){

        this.recibos = base.db.getCollection("Recibos", Recibo.class);

    }

    public void buscar(){

        try {
            ArrayList<Recibo> recibosConsultados = new ArrayList<>();
            recibos.find();


            System.out.println("BUSCAMOS ");
            for (Recibo r : recibosConsultados) {
                System.out.println(r.toString());
            }
        }catch (Exception e){
            System.out.println("Error detectado en buscar(): "+e);
        }

    }


}

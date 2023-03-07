package org.example.model.entities.daos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Indexes;
import com.mongodb.client.model.Projections;
import org.example.model.entities.models.Cliente;

import java.util.ArrayList;

public class ClienteDAO{

    private MongoCollection<Cliente> clientes;

    public ClienteDAO(BaseDAO base){
        this.clientes = base.db.getCollection("Clientes", Cliente.class);
    }

    public void buscarCarlos(){
        try {
            ArrayList<Cliente> clientesConsultados = new ArrayList<>();
            clientes.find(Filters.eq("nombre", "Carlos")).sort(Indexes.ascending("apellidos"))
                    .projection(Projections.exclude("_id", "fecha", "reciboId")).into(clientesConsultados);


            System.out.println("BUSCAMOS LOS CIENTES LLAMADOS CARLOS Y LOS ORDENAMOS POR ORDEN ALFABÉTICO POR LOS APELLIDOS");
            for (Cliente c : clientesConsultados) {
                System.out.println(c.toString());
            }
        }catch (Exception e){
            System.out.println("Error detectado en buscarCarlos(): "+e);
        }
    }

    public void buscar1980(){
        try {
            ArrayList<Cliente> clientesConsultados = new ArrayList<>();
            clientes.find(Filters.lt("fecha", "1980")).sort(Indexes.ascending("nombre"))
                    .projection(Projections.exclude("_id", "reciboId")).into(clientesConsultados);


            System.out.println("BUSCAMOS LOS CIENTES NACIDOS ANTES DE 1980 Y LOS ORDENAMOS POR ORDEN ALFABÉTICO POR EL NOMBRE");
            for (Cliente c : clientesConsultados) {
                System.out.println(c.toString());
            }
        }catch (Exception e){
            System.out.println("Error detectado en buscar1980(): "+e);
        }
    }

}

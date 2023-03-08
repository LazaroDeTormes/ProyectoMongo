package org.example.model.entities.daos;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Indexes;
import com.mongodb.client.model.Projections;
import org.bson.types.ObjectId;
import org.example.model.entities.models.Cliente;
import org.example.model.entities.models.Coche;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;

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



    public void actualizarModelo(){
        try{
            coches.updateOne(
                    Filters.eq("_id", new ObjectId("6407b0c3c1d2b22958306a4e")),
                    combine(set("modelo", "Toyota Corola")));

            System.out.println("ACTUALIZAMOS EL MODELO DE UN COCHE");
        }catch (Exception e){
            System.out.println(e);
        }
    }




    public void exportar(){

        try {



            ObjectMapper mapeador = new ObjectMapper();
            // Recorro la colección completa y añado línea a línea:
            List<Coche> consulta = coches.find()
                    .into(new ArrayList<Coche>());

            File fichero = new
                    File("C:\\Users\\Alex\\OneDrive\\Documentos\\CLASE\\ProyectoMongo\\ficheroCoches.json");


            mapeador.writeValue(fichero, consulta);


            // Cierro el archivo:
        } catch (Exception e){
            System.out.println(e);
        }
    }

}

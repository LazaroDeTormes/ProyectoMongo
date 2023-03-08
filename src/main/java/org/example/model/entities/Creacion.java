package org.example.model.entities;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.example.model.entities.models.*;

import java.util.*;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class Creacion {


    public static void creacion(MongoDatabase db){

        Cliente cli1 = new Cliente();
        cli1.setId(ObjectId.get());
        cli1.setNombre("Fernando");
        cli1.setApellidos("Alonso Díaz");
        cli1.setCorreo("fernaso@gmail.com");
        cli1.setFecha("1999");

        Cliente cli2 = new Cliente();
        cli2.setId(ObjectId.get());
        cli2.setNombre("Carlos");
        cli2.setApellidos("Sainz Vázquez de Castro");
        cli2.setCorreo("casavaca@gmail.com");
        cli2.setFecha("1988");

        Cliente cli3 = new Cliente();
        cli3.setId(ObjectId.get());
        cli3.setNombre("Martin");
        cli3.setApellidos("Hamilton");
        cli3.setCorreo("poophead@gmail.com");
        cli3.setFecha("1989");

        Cliente cli4 = new Cliente();
        cli4.setId(ObjectId.get());
        cli4.setNombre("Alberto");
        cli4.setApellidos("Chicote Porco");
        cli4.setCorreo("chicobocata@gmail.com");
        cli4.setFecha("1969");

        Cliente cli5 = new Cliente();
        cli5.setId(ObjectId.get());
        cli5.setNombre("Cristina");
        cli5.setApellidos("Pedroche Vestido");
        cli5.setCorreo("campanera@gmail.com");
        cli5.setFecha("1979");

        Cliente cli6 = new Cliente();
        cli6.setId(ObjectId.get());
        cli6.setNombre("Francisco");
        cli6.setApellidos("Cuesta Selva");
        cli6.setCorreo("santufran@gmail.com");
        cli6.setFecha("1975");

        Cliente cli7 = new Cliente();
        cli7.setId(ObjectId.get());
        cli7.setNombre("Ibai");
        cli7.setApellidos("Llanos Hondos");
        cli7.setCorreo("nomelocreo@gmail.com");
        cli7.setFecha("1995");

        Cliente cli8 = new Cliente();
        cli8.setId(ObjectId.get());
        cli8.setNombre("Hershel");
        cli8.setApellidos("Pizarro Stones");
        cli8.setCorreo("sombrero@gmail.com");
        cli8.setFecha("1980");

        Cliente cli9 = new Cliente();
        cli9.setId(ObjectId.get());
        cli9.setNombre("Carlos");
        cli9.setApellidos("Bolena Botella");
        cli9.setCorreo("eibibi@gmail.com");
        cli9.setFecha("1992");

        Cliente cli10 = new Cliente();
        cli10.setId(ObjectId.get());
        cli10.setNombre("Héctor");
        cli10.setApellidos("Puyol Riveiro");
        cli10.setCorreo("puritime@gmail.com");
        cli1.setFecha("1996");

        Cliente cli11 = new Cliente();
        cli11.setId(ObjectId.get());
        cli11.setNombre("Miriam");
        cli11.setApellidos("García Pérez");
        cli11.setCorreo("miriam19@gmail.com");
        cli11.setFecha("1977");

        Cliente cli12 = new Cliente();
        cli12.setId(ObjectId.get());
        cli12.setNombre("Celia");
        cli12.setApellidos("Mbappé Ronaldo");
        cli12.setCorreo("fernaso@gmail.com");
        cli12.setFecha("1999");

        Cliente cli13 = new Cliente();
        cli13.setId(ObjectId.get());
        cli13.setNombre("Iago");
        cli13.setApellidos("Aspas Calderón");
        cli13.setCorreo("numerouno@gmail.com");
        cli13.setFecha("1997");

        //=====================================================================================

        Cocinero coc1 = new Cocinero();
        coc1.setId(ObjectId.get());
        coc1.setNombre("José");
        coc1.setApellidos("Mota Gutiérrez");

        Cocinero coc2 = new Cocinero();
        coc2.setId(ObjectId.get());
        coc2.setNombre("Cirilo");
        coc2.setApellidos("Álvarez Mojica");

        Cocinero coc3 = new Cocinero();
        coc3.setId(ObjectId.get());
        coc3.setNombre("Jimena");
        coc3.setApellidos("Tarrasa López");

        Cocinero coc4 = new Cocinero();
        coc4.setId(ObjectId.get());
        coc4.setNombre("Claudia");
        coc4.setApellidos("García Almádena");

        Cocinero coc5 = new Cocinero();
        coc5.setId(ObjectId.get());
        coc5.setNombre("Penélope");
        coc5.setApellidos("Alguacil Frey");

        Cocinero coc6 = new Cocinero();
        coc6.setId(ObjectId.get());
        coc6.setNombre("Lucas");
        coc6.setApellidos("Oyarzábal Pineda");

        Cocinero coc7 = new Cocinero();
        coc7.setId(ObjectId.get());
        coc7.setNombre("Laura");
        coc7.setApellidos("Soto Oriamendi");

        Cocinero coc8 = new Cocinero();
        coc8.setId(ObjectId.get());
        coc8.setNombre("Mónica");
        coc8.setApellidos("Bonachea Rodríguez");

        Cocinero coc9 = new Cocinero();
        coc9.setId(ObjectId.get());
        coc9.setNombre("Juan Alberto");
        coc9.setApellidos("Ruiz Pereira");

        Cocinero coc10 = new Cocinero();
        coc10.setId(ObjectId.get());
        coc10.setNombre("João");
        coc10.setApellidos("Castelo Belhado");

        //========================================================================================

        Coche coche1 = new Coche();
        coche1.setId(ObjectId.get());
        coche1.setMatricula("AL0001MM");
        coche1.setModelo("Seat Ibiza");
        coche1.setConductorId(coc1.getId());

        Coche coche2 = new Coche();
        coche2.setId(ObjectId.get());
        coche2.setMatricula("TA0002LB");
        coche2.setModelo("Mercedes Benz");
        coche2.setConductorId(coc2.getId());

        Coche coche3 = new Coche();
        coche3.setId(ObjectId.get());
        coche3.setMatricula("PO0003HM");
        coche3.setModelo("Dacia Duster");
        coche3.setConductorId(coc3.getId());

        Coche coche4 = new Coche();
        coche4.setId(ObjectId.get());
        coche4.setMatricula("VA0004FG");
        coche4.setModelo("Opel Corsa");
        coche4.setConductorId(coc4.getId());

        Coche coche5 = new Coche();
        coche5.setId(ObjectId.get());
        coche5.setMatricula("NA0005RE");
        coche5.setModelo("Catapulta Romana");
        coche5.setConductorId(coc5.getId());

        Coche coche6 = new Coche();
        coche6.setId(ObjectId.get());
        coche6.setMatricula("JA0006KU");
        coche6.setModelo("Mercedes Benz");
        coche6.setConductorId(coc6.getId());

        Coche coche7 = new Coche();
        coche7.setId(ObjectId.get());
        coche7.setMatricula("SE0007TW");
        coche7.setModelo("Ford Nucleon");
        coche7.setConductorId(coc7.getId());

        Coche coche8 = new Coche();
        coche8.setId(ObjectId.get());
        coche8.setMatricula("MA0008HH");
        coche8.setModelo("Renault Twingo");
        coche8.setConductorId(coc8.getId());

        Coche coche9 = new Coche();
        coche9.setId(ObjectId.get());
        coche9.setMatricula("TO0009AS");
        coche9.setModelo("Carro de Bueyes");
        coche9.setConductorId(coc9.getId());

        Coche coche10 = new Coche();
        coche10.setId(ObjectId.get());
        coche10.setMatricula("ZA0010MO");
        coche10.setModelo("Dodge 3700 GT");
        coche10.setConductorId(coc10.getId());

        //==============================================================================

        Recibo rec1 = new Recibo();
        rec1.setId(ObjectId.get());
        rec1.setImporte(40);
        rec1.setCocineroId(coc1.getId());
        rec1.setCompradorId(cli1.getId());
        rec1.setFecha("01/01/2023");
        rec1.setDescripcion("descripción 1");

        Recibo rec2 = new Recibo();
        rec2.setId(ObjectId.get());
        rec2.setImporte(140);
        rec2.setCocineroId(coc2.getId());
        rec2.setCompradorId(cli2.getId());
        rec2.setFecha("02/02/2023");
        rec2.setDescripcion("descripción 2");

        Recibo rec3 = new Recibo();
        rec3.setId(ObjectId.get());
        rec3.setImporte(20);
        rec3.setCocineroId(coc3.getId());
        rec3.setCompradorId(cli3.getId());
        rec3.setFecha("03/03/2023");
        rec3.setDescripcion("descripción 3");

        Recibo rec4 = new Recibo();
        rec4.setId(ObjectId.get());
        rec4.setImporte(12);
        rec4.setCocineroId(coc4.getId());
        rec4.setCompradorId(cli4.getId());
        rec4.setFecha("04/04/2022");
        rec4.setDescripcion("descripción 4");

        Recibo rec5 = new Recibo();
        rec5.setId(ObjectId.get());
        rec5.setImporte(17);
        rec5.setCocineroId(coc5.getId());
        rec5.setCompradorId(cli5.getId());
        rec5.setFecha("05/05/2022");
        rec5.setDescripcion("descripción 5");

        Recibo rec6 = new Recibo();
        rec6.setId(ObjectId.get());
        rec6.setImporte(89);
        rec6.setCocineroId(coc6.getId());
        rec6.setCompradorId(cli6.getId());
        rec6.setFecha("06/06/2022");
        rec6.setDescripcion("descripción 6");

        Recibo rec7 = new Recibo();
        rec7.setId(ObjectId.get());
        rec7.setImporte(40);
        rec7.setCocineroId(coc7.getId());
        rec7.setCompradorId(cli7.getId());
        rec7.setFecha("07/07/2022");
        rec7.setDescripcion("descripción 7");

        Recibo rec8 = new Recibo();
        rec8.setId(ObjectId.get());
        rec8.setImporte(44);
        rec8.setCocineroId(coc8.getId());
        rec8.setCompradorId(cli8.getId());
        rec8.setFecha("08/08/2022");
        rec8.setDescripcion("descripción 8");

        Recibo rec9 = new Recibo();
        rec9.setId(ObjectId.get());
        rec9.setImporte(24);
        rec9.setCocineroId(coc9.getId());
        rec9.setCompradorId(cli9.getId());
        rec9.setFecha("09/09/2022");
        rec9.setDescripcion("descripción 9");

        Recibo rec10 = new Recibo();
        rec10.setId(ObjectId.get());
        rec10.setImporte(22);
        rec10.setCocineroId(coc10.getId());
        rec10.setCompradorId(cli10.getId());
        rec10.setFecha("11/11/2022");
        rec10.setDescripcion("descripción 10");

        Recibo rec11 = new Recibo();
        rec11.setId(ObjectId.get());
        rec11.setImporte(10);
        rec11.setCocineroId(coc1.getId());
        rec11.setCompradorId(cli1.getId());
        rec11.setFecha("01/01/2023");
        rec11.setDescripcion("descripción 11");

        Recibo rec12 = new Recibo();
        rec12.setId(ObjectId.get());
        rec12.setImporte(17);
        rec12.setCocineroId(coc1.getId());
        rec12.setCompradorId(cli12.getId());
        rec12.setFecha("24/11/2022");
        rec12.setDescripcion("descripción 12");

        Recibo rec13 = new Recibo();
        rec13.setId(ObjectId.get());
        rec13.setImporte(17);
        rec13.setCocineroId(coc2.getId());
        rec13.setCompradorId(cli13.getId());
        rec13.setFecha("08/06/2022");
        rec13.setDescripcion("descripción 13");

        //=================================================================================================

        Plato pla1 = new Plato();
        pla1.setId(ObjectId.get());
        pla1.setNombre("Patatas");
        pla1.setPrecio(10);
        pla1.setTipo("tapas");

        Plato pla2 = new Plato();
        pla2.setId(ObjectId.get());
        pla2.setNombre("Croquetas");
        pla2.setPrecio(7);
        pla2.setTipo("tapas");

        Plato pla3 = new Plato();
        pla3.setId(ObjectId.get());
        pla3.setNombre("Ensalada Campestre");
        pla3.setPrecio(12);
        pla3.setTipo("plato principal");

        Plato pla4 = new Plato();
        pla4.setId(ObjectId.get());
        pla4.setNombre("Paella");
        pla4.setPrecio(20);
        pla4.setTipo("plato principal");

        Plato pla5 = new Plato();
        pla5.setId(ObjectId.get());
        pla5.setNombre("Arroz con cosas");
        pla5.setPrecio(89);
        pla5.setTipo("plato principal");

        Plato pla6 = new Plato();
        pla6.setId(ObjectId.get());
        pla6.setNombre("Pulpo");
        pla6.setPrecio(140);
        pla6.setTipo("tapas");


        //============================================================================================

        coc1.setCocheId(coche1.getId());
        coc2.setCocheId(coche2.getId());
        coc3.setCocheId(coche3.getId());
        coc4.setCocheId(coche4.getId());
        coc5.setCocheId(coche5.getId());
        coc6.setCocheId(coche6.getId());
        coc7.setCocheId(coche7.getId());
        coc8.setCocheId(coche8.getId());
        coc9.setCocheId(coche9.getId());
        coc10.setCocheId(coche10.getId());

        ItemFactura if1 = new ItemFactura();
        if1.setPlatoId(pla4.getId());
        if1.setCantidad(2);

        ItemFactura if2 = new ItemFactura();
        if2.setPlatoId(pla6.getId());
        if2.setCantidad(1);

        ItemFactura if3 = new ItemFactura();
        if3.setPlatoId(pla4.getId());
        if3.setCantidad(1);

        ItemFactura if4 = new ItemFactura();
        if4.setPlatoId(pla3.getId());
        if4.setCantidad(1);

        ItemFactura if5 = new ItemFactura();
        if5.setPlatoId(pla1.getId());
        if5.setCantidad(1);

        ItemFactura if6 = new ItemFactura();
        if6.setPlatoId(pla2.getId());
        if6.setCantidad(1);

        ItemFactura if7 = new ItemFactura();
        if7.setPlatoId(pla5.getId());
        if7.setCantidad(1);

        ItemFactura if8 = new ItemFactura();
        if8.setPlatoId(pla1.getId());
        if8.setCantidad(4);







        ArrayList<ItemFactura> lista1 = new ArrayList<>();
        lista1.add(if1);
        rec1.setItems(lista1);

        ArrayList<ItemFactura> lista2 = new ArrayList<>();
        lista2.add(if2);
        rec2.setItems(lista2);

        ArrayList<ItemFactura> lista3 = new ArrayList<>();
        lista3.add(if3);
        rec3.setItems(lista3);

        ArrayList<ItemFactura> lista4 = new ArrayList<>();
        lista4.add(if4);
        rec4.setItems(lista4);

        ArrayList<ItemFactura> lista5 = new ArrayList<>();
        lista5.add(if5);
        lista5.add(if6);
        rec5.setItems(lista5);
        rec12.setItems(lista5);
        rec13.setItems(lista5);

        ArrayList<ItemFactura> lista6 = new ArrayList<>();
        lista6.add(if7);
        rec6.setItems(lista6);

        ArrayList<ItemFactura> lista7 = new ArrayList<>();
        lista7.add(if1);
        rec7.setItems(lista7);

        ArrayList<ItemFactura> lista8 = new ArrayList<>();
        lista8.add(if5);
        lista8.add(if5);
        lista8.add(if3);
        rec8.setItems(lista8);

        ArrayList<ItemFactura> lista9 = new ArrayList<>();
        lista9.add(if5);
        lista9.add(if5);
        rec9.setItems(lista9);

        ArrayList<ItemFactura> lista10 = new ArrayList<>();
        lista10.add(if4);
        lista10.add(if5);
        rec10.setItems(lista10);

        ArrayList<ItemFactura> lista11 = new ArrayList<>();
        lista11.add(if4);
        rec11.setItems(lista11);

        ArrayList<ObjectId> list1 = new ArrayList<>();
        list1.add(rec1.getId());
        cli1.setRecibo(list1);

        ArrayList<ObjectId> list2 = new ArrayList<>();
        list2.add(rec2.getId());
        cli2.setRecibo(list2);

        ArrayList<ObjectId> list3 = new ArrayList<>();
        list3.add(rec3.getId());
        cli3.setRecibo(list3);

        ArrayList<ObjectId> list4 = new ArrayList<>();
        list4.add(rec4.getId());
        cli4.setRecibo(list4);

        ArrayList<ObjectId> list5 = new ArrayList<>();
        list5.add(rec5.getId());
        cli5.setRecibo(list5);

        ArrayList<ObjectId> list6 = new ArrayList<>();
        list6.add(rec6.getId());
        cli6.setRecibo(list6);

        ArrayList<ObjectId> list7 = new ArrayList<>();
        list7.add(rec7.getId());
        cli7.setRecibo(list7);

        ArrayList<ObjectId> list8 = new ArrayList<>();
        list8.add(rec8.getId());
        cli8.setRecibo(list8);

        ArrayList<ObjectId> list9 = new ArrayList<>();
        list9.add(rec9.getId());
        cli9.setRecibo(list9);

        ArrayList<ObjectId> list10 = new ArrayList<>();
        list10.add(rec10.getId());
        cli10.setRecibo(list10);

        ArrayList<ObjectId> list11 = new ArrayList<>();
        list11.add(rec11.getId());
        cli11.setRecibo(list11);

        ArrayList<ObjectId> list12 = new ArrayList<>();
        list12.add(rec12.getId());
        cli12.setRecibo(list12);

        ArrayList<ObjectId> list13 = new ArrayList<>();
        list13.add(rec13.getId());
        cli13.setRecibo(list13);









        MongoCollection<Document> clientes = db.getCollection("Clientes");
        MongoCollection<Document> recibos = db.getCollection("Recibos");
        MongoCollection<Document> coches = db.getCollection("Coches");
        MongoCollection<Document> cocineros = db.getCollection("Cocineros");
        MongoCollection<Document> platos = db.getCollection("Platos");


        clientes.insertOne(PojoToDocument.parse(cli1));
        clientes.insertOne(PojoToDocument.parse(cli2));
        clientes.insertOne(PojoToDocument.parse(cli3));
        clientes.insertOne(PojoToDocument.parse(cli4));
        clientes.insertOne(PojoToDocument.parse(cli5));
        clientes.insertOne(PojoToDocument.parse(cli6));
        clientes.insertOne(PojoToDocument.parse(cli7));
        clientes.insertOne(PojoToDocument.parse(cli8));
        clientes.insertOne(PojoToDocument.parse(cli9));
        clientes.insertOne(PojoToDocument.parse(cli10));
        clientes.insertOne(PojoToDocument.parse(cli11));
        clientes.insertOne(PojoToDocument.parse(cli12));
        clientes.insertOne(PojoToDocument.parse(cli13));



        recibos.insertOne(PojoToDocument.parse(rec1));
        recibos.insertOne(PojoToDocument.parse(rec2));
        recibos.insertOne(PojoToDocument.parse(rec3));
        recibos.insertOne(PojoToDocument.parse(rec4));
        recibos.insertOne(PojoToDocument.parse(rec5));
        recibos.insertOne(PojoToDocument.parse(rec6));
        recibos.insertOne(PojoToDocument.parse(rec7));
        recibos.insertOne(PojoToDocument.parse(rec8));
        recibos.insertOne(PojoToDocument.parse(rec9));
        recibos.insertOne(PojoToDocument.parse(rec10));
        recibos.insertOne(PojoToDocument.parse(rec11));
        recibos.insertOne(PojoToDocument.parse(rec12));
        recibos.insertOne(PojoToDocument.parse(rec13));



        coches.insertOne(PojoToDocument.parse(coche1));
        coches.insertOne(PojoToDocument.parse(coche2));
        coches.insertOne(PojoToDocument.parse(coche3));
        coches.insertOne(PojoToDocument.parse(coche4));
        coches.insertOne(PojoToDocument.parse(coche5));
        coches.insertOne(PojoToDocument.parse(coche6));
        coches.insertOne(PojoToDocument.parse(coche7));
        coches.insertOne(PojoToDocument.parse(coche8));
        coches.insertOne(PojoToDocument.parse(coche9));
        coches.insertOne(PojoToDocument.parse(coche10));



        cocineros.insertOne(PojoToDocument.parse(coc1));
        cocineros.insertOne(PojoToDocument.parse(coc2));
        cocineros.insertOne(PojoToDocument.parse(coc3));
        cocineros.insertOne(PojoToDocument.parse(coc4));
        cocineros.insertOne(PojoToDocument.parse(coc5));
        cocineros.insertOne(PojoToDocument.parse(coc6));
        cocineros.insertOne(PojoToDocument.parse(coc7));
        cocineros.insertOne(PojoToDocument.parse(coc8));
        cocineros.insertOne(PojoToDocument.parse(coc9));
        cocineros.insertOne(PojoToDocument.parse(coc10));



        platos.insertOne(PojoToDocument.parse(pla1));
        platos.insertOne(PojoToDocument.parse(pla2));
        platos.insertOne(PojoToDocument.parse(pla3));
        platos.insertOne(PojoToDocument.parse(pla4));
        platos.insertOne(PojoToDocument.parse(pla5));
        platos.insertOne(PojoToDocument.parse(pla6));














    }

}

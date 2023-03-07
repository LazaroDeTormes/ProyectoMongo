package org.example.model.entities;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.util.*;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class Creacion {


    public static void creacion(MongoDatabase db){

        Cliente cli1 = new Cliente();
        cli1.setNombre("Fernando");
        cli1.setApellidos("Alonso Díaz");
        cli1.setCorreo("fernaso@gmail.com");
        cli1.setFecha("1999");

        Cliente cli2 = new Cliente();
        cli2.setNombre("Carlos");
        cli2.setApellidos("Sainz Vázquez de Castro");
        cli2.setCorreo("casavaca@gmail.com");
        cli2.setFecha("1988");

        Cliente cli3 = new Cliente();
        cli3.setNombre("Martin");
        cli3.setApellidos("Hamilton");
        cli3.setCorreo("poophead@gmail.com");
        cli3.setFecha("1989");

        Cliente cli4 = new Cliente();
        cli4.setNombre("Alberto");
        cli4.setApellidos("Chicote Porco");
        cli4.setCorreo("chicobocata@gmail.com");
        cli4.setFecha("1969");

        Cliente cli5 = new Cliente();
        cli5.setNombre("Cristina");
        cli5.setApellidos("Pedroche Vestido");
        cli5.setCorreo("campanera@gmail.com");
        cli5.setFecha("1979");

        Cliente cli6 = new Cliente();
        cli6.setNombre("Francisco");
        cli6.setApellidos("Cuesta Selva");
        cli6.setCorreo("santufran@gmail.com");
        cli6.setFecha("1975");

        Cliente cli7 = new Cliente();
        cli7.setNombre("Ibai");
        cli7.setApellidos("Llanos Hondos");
        cli7.setCorreo("nomelocreo@gmail.com");
        cli7.setFecha("1995");

        Cliente cli8 = new Cliente();
        cli8.setNombre("Hershel");
        cli8.setApellidos("Pizarro Stones");
        cli8.setCorreo("sombrero@gmail.com");
        cli8.setFecha("1980");

        Cliente cli9 = new Cliente();
        cli9.setNombre("Ana");
        cli9.setApellidos("Bolena Botella");
        cli9.setCorreo("eibibi@gmail.com");
        cli9.setFecha("1992");

        Cliente cli10 = new Cliente();
        cli10.setNombre("Héctor");
        cli10.setApellidos("Puyol Riveiro");
        cli10.setCorreo("puritime@gmail.com");
        cli1.setFecha("1996");

        Cliente cli11 = new Cliente();
        cli11.setNombre("Miriam");
        cli11.setApellidos("García Pérez");
        cli11.setCorreo("miriam19@gmail.com");
        cli11.setFecha("1977");

        Cliente cli12 = new Cliente();
        cli12.setNombre("Celia");
        cli12.setApellidos("Mbappé Ronaldo");
        cli12.setCorreo("fernaso@gmail.com");
        cli12.setFecha("1999");

        Cliente cli13 = new Cliente();
        cli13.setNombre("Iago");
        cli13.setApellidos("Aspas Calderón");
        cli13.setCorreo("numerouno@gmail.com");
        cli13.setFecha("1997");

        //=====================================================================================

        Cocinero coc1 = new Cocinero();
        coc1.setNombre("José");
        coc1.setApellidos("Mota Gutiérrez");

        Cocinero coc2 = new Cocinero();
        coc2.setNombre("Cirilo");
        coc2.setApellidos("Álvarez Mojica");

        Cocinero coc3 = new Cocinero();
        coc3.setNombre("Jimena");
        coc3.setApellidos("Tarrasa López");

        Cocinero coc4 = new Cocinero();
        coc4.setNombre("Claudia");
        coc4.setApellidos("García Almádena");

        Cocinero coc5 = new Cocinero();
        coc5.setNombre("Penélope");
        coc5.setApellidos("Alguacil Frey");

        Cocinero coc6 = new Cocinero();
        coc6.setNombre("Lucas");
        coc6.setApellidos("Oyarzábal Pineda");

        Cocinero coc7 = new Cocinero();
        coc7.setNombre("Laura");
        coc7.setApellidos("Soto Oriamendi");

        Cocinero coc8 = new Cocinero();
        coc8.setNombre("Mónica");
        coc8.setApellidos("Bonachea Rodríguez");

        Cocinero coc9 = new Cocinero();
        coc9.setNombre("Juan Alberto");
        coc9.setApellidos("Ruiz Pereira");

        Cocinero coc10 = new Cocinero();
        coc10.setNombre("João");
        coc10.setApellidos("Castelo Belhado");

        //========================================================================================

        Coche coche1 = new Coche();
        coche1.setMatricula("AL0001MM");
        coche1.setModelo("Seat Ibiza");
        coche1.setConductor(coc1);

        Coche coche2 = new Coche();
        coche2.setMatricula("TA0002LB");
        coche2.setModelo("Seat Ibiza");
        coche2.setConductor(coc2);

        Coche coche3 = new Coche();
        coche3.setMatricula("PO0003HM");
        coche3.setModelo("Seat Ibiza");
        coche3.setConductor(coc3);

        Coche coche4 = new Coche();
        coche4.setMatricula("VA0004FG");
        coche4.setModelo("Seat Ibiza");
        coche4.setConductor(coc4);

        Coche coche5 = new Coche();
        coche5.setMatricula("NA0005RE");
        coche5.setModelo("Seat Ibiza");
        coche5.setConductor(coc5);

        Coche coche6 = new Coche();
        coche6.setMatricula("JA0006KU");
        coche6.setModelo("Seat Ibiza");
        coche6.setConductor(coc6);

        Coche coche7 = new Coche();
        coche7.setMatricula("SE0007TW");
        coche7.setModelo("Seat Ibiza");
        coche7.setConductor(coc7);

        Coche coche8 = new Coche();
        coche8.setMatricula("MA0008HH");
        coche8.setModelo("Seat Ibiza");
        coche8.setConductor(coc8);

        Coche coche9 = new Coche();
        coche9.setMatricula("TO0009AS");
        coche9.setModelo("Seat Ibiza");
        coche9.setConductor(coc9);

        Coche coche10 = new Coche();
        coche10.setMatricula("ZA0010MO");
        coche10.setModelo("Seat Ibiza");
        coche10.setConductor(coc10);

        //==============================================================================

        Recibo rec1 = new Recibo();
        rec1.setImporte(40);
        rec1.setFacturadaPor(coc1);
        rec1.setComprador(cli1);
        rec1.setFecha("01/01/2023");
        rec1.setDescripcion("descripción 1");

        Recibo rec2 = new Recibo();
        rec2.setImporte(140);
        rec2.setFacturadaPor(coc2);
        rec2.setComprador(cli2);
        rec2.setFecha("02/02/2023");
        rec2.setDescripcion("descripción 2");

        Recibo rec3 = new Recibo();
        rec3.setImporte(20);
        rec3.setFacturadaPor(coc3);
        rec3.setComprador(cli3);
        rec3.setFecha("03/03/2023");
        rec3.setDescripcion("descripción 3");

        Recibo rec4 = new Recibo();
        rec4.setImporte(12);
        rec4.setFacturadaPor(coc4);
        rec4.setComprador(cli4);
        rec4.setFecha("04/04/2022");
        rec4.setDescripcion("descripción 4");

        Recibo rec5 = new Recibo();
        rec5.setImporte(17);
        rec5.setFacturadaPor(coc5);
        rec5.setComprador(cli5);
        rec5.setFecha("05/05/2022");
        rec5.setDescripcion("descripción 5");

        Recibo rec6 = new Recibo();
        rec6.setImporte(89);
        rec6.setFacturadaPor(coc6);
        rec6.setComprador(cli6);
        rec6.setFecha("06/06/2022");
        rec6.setDescripcion("descripción 6");

        Recibo rec7 = new Recibo();
        rec7.setImporte(40);
        rec7.setFacturadaPor(coc7);
        rec7.setComprador(cli7);
        rec7.setFecha("07/07/2022");
        rec7.setDescripcion("descripción 7");

        Recibo rec8 = new Recibo();
        rec8.setImporte(44);
        rec8.setFacturadaPor(coc8);
        rec8.setComprador(cli8);
        rec8.setFecha("08/08/2022");
        rec8.setDescripcion("descripción 8");

        Recibo rec9 = new Recibo();
        rec9.setImporte(24);
        rec9.setFacturadaPor(coc9);
        rec9.setComprador(cli9);
        rec9.setFecha("09/09/2022");
        rec9.setDescripcion("descripción 9");

        Recibo rec10 = new Recibo();
        rec10.setImporte(22);
        rec10.setFacturadaPor(coc10);
        rec10.setComprador(cli10);
        rec10.setFecha("11/11/2022");
        rec10.setDescripcion("descripción 10");

        Recibo rec11 = new Recibo();
        rec11.setImporte(10);
        rec11.setFacturadaPor(coc1);
        rec11.setComprador(cli1);
        rec11.setFecha("01/01/2023");
        rec11.setDescripcion("descripción 11");

        Recibo rec12 = new Recibo();
        rec12.setImporte(17);
        rec12.setFacturadaPor(coc1);
        rec12.setComprador(cli12);
        rec12.setFecha("24/11/2022");
        rec12.setDescripcion("descripción 12");

        Recibo rec13 = new Recibo();
        rec13.setImporte(17);
        rec13.setFacturadaPor(coc2);
        rec13.setComprador(cli13);
        rec13.setFecha("08/06/2022");
        rec13.setDescripcion("descripción 13");

        //=================================================================================================

        Plato pla1 = new Plato();
        pla1.setNombre("Patatas");
        pla1.setPrecio(10);

        Plato pla2 = new Plato();
        pla2.setNombre("Croquetas");
        pla2.setPrecio(7);

        Plato pla3 = new Plato();
        pla3.setNombre("Ensalada Campestre");
        pla3.setPrecio(12);

        Plato pla4 = new Plato();
        pla4.setNombre("Paella");
        pla4.setPrecio(20);

        Plato pla5 = new Plato();
        pla5.setNombre("Arroz con cosas");
        pla5.setPrecio(89);

        Plato pla6 = new Plato();
        pla6.setNombre("Pulpo");
        pla6.setPrecio(140);


        //============================================================================================

        coc1.setCoche(coche1);
        coc2.setCoche(coche2);
        coc3.setCoche(coche3);
        coc4.setCoche(coche4);
        coc5.setCoche(coche5);
        coc6.setCoche(coche6);
        coc7.setCoche(coche7);
        coc8.setCoche(coche8);
        coc9.setCoche(coche9);
        coc10.setCoche(coche10);

        ItemFactura if1 = new ItemFactura();
        if1.setPlato(pla4);
        if1.setCantidad(2);

        ItemFactura if2 = new ItemFactura();
        if2.setPlato(pla6);
        if2.setCantidad(1);

        ItemFactura if3 = new ItemFactura();
        if3.setPlato(pla4);
        if3.setCantidad(1);

        ItemFactura if4 = new ItemFactura();
        if4.setPlato(pla3);
        if4.setCantidad(1);

        ItemFactura if5 = new ItemFactura();
        if5.setPlato(pla1);
        if5.setCantidad(1);

        ItemFactura if6 = new ItemFactura();
        if6.setPlato(pla2);
        if6.setCantidad(1);

        ItemFactura if7 = new ItemFactura();
        if7.setPlato(pla5);
        if7.setCantidad(1);

        ItemFactura if8 = new ItemFactura();
        if8.setPlato(pla1);
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

        ArrayList<Recibo> list1 = new ArrayList<>();
        list1.add(rec1);
        cli1.setRecibo(list1);

        ArrayList<Recibo> list2 = new ArrayList<>();
        list2.add(rec2);
        cli2.setRecibo(list2);

        ArrayList<Recibo> list3 = new ArrayList<>();
        list3.add(rec3);
        cli3.setRecibo(list3);

        ArrayList<Recibo> list4 = new ArrayList<>();
        list4.add(rec4);
        cli4.setRecibo(list4);

        ArrayList<Recibo> list5 = new ArrayList<>();
        list5.add(rec5);
        cli5.setRecibo(list5);

        ArrayList<Recibo> list6 = new ArrayList<>();
        list6.add(rec6);
        cli6.setRecibo(list6);

        ArrayList<Recibo> list7 = new ArrayList<>();
        list7.add(rec7);
        cli7.setRecibo(list7);

        ArrayList<Recibo> list8 = new ArrayList<>();
        list8.add(rec8);
        cli8.setRecibo(list8);

        ArrayList<Recibo> list9 = new ArrayList<>();
        list9.add(rec9);
        cli9.setRecibo(list9);

        ArrayList<Recibo> list10 = new ArrayList<>();
        list10.add(rec10);
        cli10.setRecibo(list10);

        ArrayList<Recibo> list11 = new ArrayList<>();
        list11.add(rec11);
        cli11.setRecibo(list11);

        ArrayList<Recibo> list12 = new ArrayList<>();
        list12.add(rec12);
        cli12.setRecibo(list12);

        ArrayList<Recibo> list13 = new ArrayList<>();
        list13.add(rec13);
        cli13.setRecibo(list13);









        MongoCollection<Cliente> clientes = db.getCollection("Clientes", Cliente.class);

        PojoToDocument.parse(cli1);
        clientes.insertOne(cli1);
        PojoToDocument.parse(cli2);
        clientes.insertOne(cli2);
        clientes.insertOne(cli3);
        clientes.insertOne(cli4);
        clientes.insertOne(cli5);
        clientes.insertOne(cli6);
        clientes.insertOne(cli7);
        clientes.insertOne(cli8);
        clientes.insertOne(cli9);
        clientes.insertOne(cli10);
        clientes.insertOne(cli11);
        clientes.insertOne(cli12);
        clientes.insertOne(cli13);

        CodecRegistry pojoCodecRegistry2 = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoCollection<Recibo> recibos = db.getCollection("Recibos", Recibo.class)
                .withCodecRegistry(pojoCodecRegistry2);

        recibos.insertOne(rec1);
        recibos.insertOne(rec2);
        recibos.insertOne(rec3);
        recibos.insertOne(rec4);
        recibos.insertOne(rec5);
        recibos.insertOne(rec6);
        recibos.insertOne(rec7);
        recibos.insertOne(rec8);
        recibos.insertOne(rec9);
        recibos.insertOne(rec10);
        recibos.insertOne(rec11);
        recibos.insertOne(rec12);
        recibos.insertOne(rec13);

        CodecRegistry pojoCodecRegistry3 = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoCollection<Coche> coches = db.getCollection("Coches", Coche.class)
                .withCodecRegistry(pojoCodecRegistry3);

        coches.insertOne(coche1);
        coches.insertOne(coche2);
        coches.insertOne(coche3);
        coches.insertOne(coche4);
        coches.insertOne(coche5);
        coches.insertOne(coche6);
        coches.insertOne(coche7);
        coches.insertOne(coche8);
        coches.insertOne(coche9);
        coches.insertOne(coche10);

        CodecRegistry pojoCodecRegistry4 = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoCollection<Cocinero> cocineros = db.getCollection("Cocinero", Cocinero.class)
                .withCodecRegistry(pojoCodecRegistry4);

        cocineros.insertOne(coc1);
        cocineros.insertOne(coc2);
        cocineros.insertOne(coc3);
        cocineros.insertOne(coc4);
        cocineros.insertOne(coc5);
        cocineros.insertOne(coc6);
        cocineros.insertOne(coc7);
        cocineros.insertOne(coc8);
        cocineros.insertOne(coc9);
        cocineros.insertOne(coc10);

        CodecRegistry pojoCodecRegistry5 = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoCollection<Plato> platos = db.getCollection("Cocinero", Plato.class)
                .withCodecRegistry(pojoCodecRegistry5);

        platos.insertOne(pla1);
        platos.insertOne(pla2);
        platos.insertOne(pla3);
        platos.insertOne(pla4);
        platos.insertOne(pla5);
        platos.insertOne(pla6);














    }

}

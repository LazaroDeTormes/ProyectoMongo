package org.example.model.entities;

import java.util.List;

public class Creacion {


    public static void creacion(){

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










    }

}

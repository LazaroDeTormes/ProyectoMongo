package org.example;

import org.example.model.entities.Creacion;
import org.example.model.entities.daos.*;


public class Main {
    public static void main(String[] args) {

        try {
            BaseDAO baseDAO = new BaseDAO();
            baseDAO.crearTablas();

            ClienteDAO clienteDAO = new ClienteDAO();
            CocheDAO cocheDAO = new CocheDAO(baseDAO);
            PlatoDAO platoDAO = new PlatoDAO();
            CocineroDAO cocineroDAO = new CocineroDAO();
            ReciboDAO reciboDAO = new ReciboDAO(baseDAO);


//===============================================BÚSQUEDAS==============================================================================

            //BUSCAMOS LOS CIENTES LLAMADOS CARLOS Y LOS ORDENAMOS POR ORDEN ALFABÉTICO POR LOS APELLIDOS
            clienteDAO.buscarCarlos();
            System.out.println("");

            //BUSCAMOS LOS CIENTES NACIDOS ANTES DE 1980 Y LOS ORDENAMOS POR ORDEN ALFABÉTICO POR EL NOMBRE
            clienteDAO.buscar1980();
            System.out.println("");

            //BUSCAMOS LOS COCHES QUE SEAN MERCEDES BENZ Y LOS ORDENAMOS POR ORDEN ALFABÉTICO DESCENDENTE POR LAS MATRÍCULAS
            cocheDAO.buscarMercedesBenz();
            System.out.println("");

            //BUSCAMOS LOS PLATOS QUE CUESTEN ENTRE 20 Y 139 EUROS Y LOS ORDENAMOS POR ORDEN ALFABÉTICO ASCENDENTE POR LOS NOMBRES
            platoDAO.buscarPorPrecio();
            System.out.println("");

            //BUSCAMOS LOS COCINEROS EN SU TOTALIDAD ORDENANDO ALFABÉTICAMENTE DE MANERA DESCENDENTE POR EL NOMBRE
            cocineroDAO.buscarTodosLosCocineros();
            System.out.println("");

            //BUSCAMOS TODOS LOS RECIBOS CON UN IMPORTE IGUAL O MENOR A 17 EUROS OCULTANDO LOS ID DE LOS COCINEROS Y COMPRADORES
            reciboDAO.buscarRecibosDe17oMenos();
            System.out.println("");

//======================================================ACTUALIZACIONES==============================================================================


            //ACTUALIZAMOS EL CORREO DE FERNAQNDO ALONSO DÍAZ
            clienteDAO.actualizarCorreoAlonso();
            System.out.println("");

            //ACTUALIZAMOS EL RECIBO IMPUESTO DE UN COCINERO
            cocineroDAO.actualizarRecibo();
            System.out.println("");

            //ACTUALIZAMOS EL MODELO DE UN COCHE
            cocheDAO.actualizarModelo();
            System.out.println("");

            //ACTUALIZAMOS LA FECHA DE UN RECIBO
            reciboDAO.actualizarFecha();
            System.out.println("");

            //ACTUALIZAMOS EL COCINERO QUE HAYA IMPUESTO UN RECIBO
            reciboDAO.actualizarCocinero();
            System.out.println("");

            //ACTUALIZAMOS EL AÑO DE NACIMIENTO DE UN CLIENTE
            clienteDAO.actualizarAnho();
            System.out.println("");

//================================================AGRUPACIONES=================================================================================

            platoDAO.agrupacion();
            platoDAO.agrupacionSuma();
            clienteDAO.agrupacionPorAnho();



//===============================================EXPORTACIONES=================================================================================

            clienteDAO.exportar();
            reciboDAO.exportar();
            platoDAO.exportar();
            cocineroDAO.exportar();
            cocheDAO.exportar();



        } catch (Exception e){
            System.out.println(e);
        }

    }
}
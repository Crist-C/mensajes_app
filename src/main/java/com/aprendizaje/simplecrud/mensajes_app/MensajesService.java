package com.aprendizaje.simplecrud.mensajes_app;

import java.util.ArrayList;
import java.util.Scanner;

public class MensajesService {

    public static void crearMensaje() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String contenidoMensaje = scanner.nextLine();

        System.out.println("Ingresa tu nombre:");
        String nombre = scanner.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(contenidoMensaje);
        registro.setAutorMensaje(nombre);

        MensajesDAO.crearMensajeDB(registro);
    }

    public static void listarMensajes(){
        ArrayList<Mensajes> mensajesArrayList;
        mensajesArrayList = MensajesDAO.leerTodosLosMensajesDB();

        for (Mensajes mensajeLeido : mensajesArrayList) {
            System.out.println("ID: "+mensajeLeido.getIdMensaje());
            System.out.println("Mensaje: "+mensajeLeido.getMensaje());
            System.out.println("Autor: "+mensajeLeido.getAutorMensaje());
            System.out.println("Fecha: "+mensajeLeido.getFechaMensaje()+"\n");
        }
    }

    public static void borrarMensaje(){

    }

    public static void editarMensaje(){

    }

}

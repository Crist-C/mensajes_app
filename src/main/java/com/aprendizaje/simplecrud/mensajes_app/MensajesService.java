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

        if(MensajesDAO.crearMensajeDB(registro) == 1)
            System.out.println("Mensaje Creado con exito 😁!!");
        else
            System.out.println("Error al crear el mensaje 😔");
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el id del mensaje que desea borrar: ");
        int idMensajeToDelete = scanner.nextInt();
        if(MensajesDAO.borrarMensajeDB(idMensajeToDelete) == 1)
            System.out.println("Mensaje eliminado con exito 😁!!");
        else System.out.println("El mensaje NO fue eliminado 😣");
    }

    public static void editarMensaje(){

    }

}

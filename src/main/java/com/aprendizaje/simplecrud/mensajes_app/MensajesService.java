package com.aprendizaje.simplecrud.mensajes_app;

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
        registro.setAutor_mensaje(nombre);

        MensajesDAO.crearMensajeDB(registro);
    }

    public static void listarMensajes(){

    }

    public static void borrarMensaje(){

    }

    public static void editarMensaje(){

    }

}

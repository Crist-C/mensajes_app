package com.aprendizaje.simplecrud.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

public class Inicio {

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("------------------------------------------");
            System.out.println("    APLICACION DE MENSAJES");
            System.out.println(" 1. Crear mensaje");
            System.out.println(" 2. Listar mensajes");
            System.out.println(" 3. Editar mensaje");
            System.out.println(" 4. Eliminar mensaje");
            System.out.println(" 5. Salir");

            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.editarMensaje();
                    break;
                case 4:
                    MensajesService.borrarMensaje();
                    break;
                case 5:
                    break;
            }


        }while (opcion != 5);

    }
}

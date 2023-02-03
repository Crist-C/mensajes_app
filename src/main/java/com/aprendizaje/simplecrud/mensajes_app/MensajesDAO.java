package com.aprendizaje.simplecrud.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajesDAO {

    public static void crearMensajeDB(Mensajes mensaje){
        Connexion dbConnexion = new Connexion();

        try (Connection connexion = dbConnexion.get_connnection()){
            PreparedStatement stament = null;
            try{
                String query = "INSERT INTO `mensajes` (`mensaje`, `autor_mensaje`) VALUES (?, ?);";
                stament = connexion.prepareStatement(query);
                stament.setString(1, mensaje.getMensaje());
                stament.setString(2, mensaje.getAutorMensaje());
                stament.executeUpdate();
                System.out.println("Mensaje Creado con exito 😁!!");

            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static Mensajes leerMensjaeDB(){
        return null;
    }

    public static void actualizarMensajeDB(Mensajes mensaje) {

    }

    public static void borrarMensajeDB(int idMensaje){

    }

}

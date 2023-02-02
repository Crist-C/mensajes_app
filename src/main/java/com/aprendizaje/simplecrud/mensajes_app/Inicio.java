package com.aprendizaje.simplecrud.mensajes_app;

import java.sql.Connection;

public class Inicio {

    public static void main (String[] args)
    {

        Connexion connexion = new Connexion();

        try(Connection  cnx = connexion.get_connnection()){

        }catch (Exception e){
            System.out.println(e);
        }

    }
}

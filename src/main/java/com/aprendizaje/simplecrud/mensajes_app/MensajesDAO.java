package com.aprendizaje.simplecrud.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MensajesDAO {

    public static int crearMensajeDB(Mensajes mensaje){
        Conexion dbConexion = new Conexion();

        try (Connection connexion = dbConexion.get_connnection()){
            PreparedStatement stament;
            try{
                String query = "INSERT INTO `mensajes` (`mensaje`, `autor_mensaje`) VALUES (?, ?);";
                stament = connexion.prepareStatement(query);
                stament.setString(1, mensaje.getMensaje());
                stament.setString(2, mensaje.getAutorMensaje());
                stament.executeUpdate();
                return 1;

            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public static ArrayList<Mensajes> leerTodosLosMensajesDB(){
        Conexion conexion = new Conexion();
        PreparedStatement statement;
        ResultSet resultSet;
        ArrayList<Mensajes> mensajesArrayList = new ArrayList<>();
        Mensajes mensajeLeido;

        try(Connection connection = conexion.get_connnection()){
            String query = "SELECT * FROM `mensajes`";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()){
                mensajeLeido = new Mensajes();
                mensajeLeido.setIdMensaje(resultSet.getInt("id_mensaje"));
                mensajeLeido.setMensaje(resultSet.getString("mensaje"));
                mensajeLeido.setAutorMensaje(resultSet.getString("autor_mensaje"));
                mensajeLeido.setFechaMensaje(resultSet.getString("fecha_mensaje"));
                mensajesArrayList.add(mensajeLeido);

            }
        }catch (SQLException e){
            System.out.println("No se logró leer los mensajes");
            System.out.println(e.getMessage());
        }
        return mensajesArrayList;
    }

    public static void actualizarMensajeDB(Mensajes mensaje) {

    }

    public static int borrarMensajeDB(int idMensaje){
        Conexion conexion = new Conexion();

        try(Connection connection = conexion.get_connnection()){
            PreparedStatement statement;
            try {
                String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
                statement = connection.prepareStatement(query);
                statement.setInt(1, idMensaje);
                statement.executeUpdate();
                return 1;
            }catch (SQLException e){
                System.out.println("No se logró eliminar el mensajes");
                System.out.println(e.getMessage());
            }
        }catch (SQLException e){
            System.out.println("No se logró eliminar el mensajes");
            System.out.println(e.getMessage());
        }
        return 0;
    }

}

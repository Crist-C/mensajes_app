package com.aprendizaje.simplecrud.mensajes_app;

public class Mensajes {
    int id_mensaje;
    String mensaje;
    String autor_mensaje;
    String fecha_mensjae;

    public Mensajes(){
    }

    public Mensajes(String mensaje, String autor_mensaje, String fecha_mensjae) {
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.fecha_mensjae = fecha_mensjae;
    }

    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutorMensaje() {
        return autor_mensaje;
    }

    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public String getFecha_mensjae() {
        return fecha_mensjae;
    }

    public void setFecha_mensjae(String fecha_mensjae) {
        this.fecha_mensjae = fecha_mensjae;
    }



}

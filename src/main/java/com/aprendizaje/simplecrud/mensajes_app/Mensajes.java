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

    public int getIdMensaje() {
        return id_mensaje;
    }

    public void setIdMensaje(int id_mensaje) {
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

    public void setAutorMensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public String getFechaMensaje() {
        return fecha_mensjae;
    }

    public void setFechaMensaje(String fecha_mensjae) {
        this.fecha_mensjae = fecha_mensjae;
    }



}

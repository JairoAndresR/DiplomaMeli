package com.diploma.ejercicio;

public class Diploma {

    private String nombreAlumno;
    private String mensaje;
    private double promedio;

    public Diploma(String nombreAlumno, String mensaje, double promedio) {
        this.nombreAlumno = nombreAlumno;
        this.mensaje = mensaje;
        this.promedio = promedio;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public String getMensaje() {
        return mensaje;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}

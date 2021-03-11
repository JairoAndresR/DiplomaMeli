package com.diploma.ejercicio;

import java.util.ArrayList;

public class Alumno
{
        private String nombre;
        private ArrayList<Asignatura> asignaturas;

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public ArrayList<Asignatura> getAsignaturas() {
                return asignaturas;
        }

        public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
                this.asignaturas = asignaturas;
        }

        public double calcularPromedio()
        {
                double prom=0;
                int tam=asignaturas.size();
                for(Asignatura a:asignaturas)
                {
                        prom = prom + a.getNota();
                }

                return prom/tam;
        }


}

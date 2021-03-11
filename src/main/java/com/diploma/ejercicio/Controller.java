package com.diploma.ejercicio;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//      JSON DE PRUEBA
//        {
//        "nombre": "Jairo",
//        "asignaturas": [
//        {
//        "nombre": "matematicas",
//        "nota": 9.0
//        },
//        {
//        "nombre": "biologia",
//        "nota": 1.0
//        }
//        ]
//        }

@RestController
public class Controller {

        @PostMapping(value = "/mensaje")
        public Diploma mensaje(@RequestBody Alumno a){

                String mensaje = "¿como hiciste para entrar en meli?";

                if (a.calcularPromedio() > 9){
                        mensaje = "felicitaciones sos un groso";
                }

                return new Diploma(a.getNombre(),mensaje, a.calcularPromedio());

        }
}

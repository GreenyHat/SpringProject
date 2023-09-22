package com.brainstorm.springboot2.app.springbootapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({ "/index", "/", "/home" }) // con {x,y...n} indicamos que queremos mapearla a mas de una ruta
    public String index(Model model) {// implementacion de interfaz con Model
        return "index";
    }

    /*
     * Cada controlador va a realizar una peticion http distintia (listar, editar
     * formulario, guardar, eliminar...)
     * siempre retorna el nombre de la vista(componentes encargados de generar la
     * interfaz.), en este caso "index"
     * mapeamos el metodo para que invoque la ruta url cuando el usuario
     * introducizca, en este caso: http://localhost:5500/index podria ser 8080, si
     * fuese por defecto, cabe destacar que el metodo de peticion por defecto si no
     * se
     * indica es GET, se indicaría: @RequestMapping(value = "/index", method =
     * RequestMethod.POST)
     * Tambien se podria ver como PostMapping(value = "/index"), GetMapping...
     * Y así (se puede ver en las anotaciones del request method) *Si no hay mas
     * parametros no es necesario asignar el valor a "value"
     * 
     * /////////////////MODEL//////////////
     * Model es un tipo (generalmente una interfaz) y model es un objeto de ese
     * tipo. En el ámbito del desarrollo web con Spring Framework, específicamente
     * en el MVC (Model-View-Controller) de Spring, Model es una interfaz que define
     * métodos para agregar atributos a la vista (es decir, los datos que se
     * mostrarán en la vista).
     */
}

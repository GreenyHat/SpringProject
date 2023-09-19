package com.brainstorm.springboot.app.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/index") // mapeamos el metodo para que invoque la ruta url cuando el usuario
    // introducizca, en este caso: http://localhost:5500/index podria ser 8080, si
    // fuese por defecto
    public String index() {
        return "index";
    }
}

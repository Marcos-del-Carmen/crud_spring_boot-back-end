package mx.com.softurasolutions.demo.servicios;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaServicos {
    
    @RequestMapping("/saludo")
    public String saludar(){
        return "Hola mundo SpringBoot";
    }
}

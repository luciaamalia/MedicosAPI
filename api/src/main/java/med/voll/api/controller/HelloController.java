package med.voll.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") //chegar uma req do tipo helo word chamar o metodo hellocontroler
public class HelloController {

    @GetMapping
    public String HelloWord(){
        return "Hello World Spring";

    }


}

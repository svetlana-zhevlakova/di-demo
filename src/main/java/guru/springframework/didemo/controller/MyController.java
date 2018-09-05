package guru.springframework.didemo.controller;

import guru.springframework.didemo.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHi(){
        System.out.println("Hi there!");
        return greetingService.sayHi();
    }
}

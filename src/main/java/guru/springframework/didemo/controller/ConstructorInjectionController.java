package guru.springframework.didemo.controller;

import guru.springframework.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {

    private GreetingService greetingService;

    public ConstructorInjectionController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHi(){
        return greetingService.sayHi();
    }
}

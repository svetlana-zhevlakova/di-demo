package guru.springframework.didemo.controller;

import guru.springframework.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingService;

    public String sayHi(){
        return greetingService.sayHi();
    }

}

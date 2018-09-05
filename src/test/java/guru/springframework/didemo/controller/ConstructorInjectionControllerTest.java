package guru.springframework.didemo.controller;

import guru.springframework.didemo.service.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectionControllerTest {

    private ConstructorInjectionController constructorInjectionController;

    @Before
    public void setUp(){
        constructorInjectionController = new ConstructorInjectionController(new GreetingServiceImpl());
    }

    @Test
    public void testSayHi(){
        Assert.assertEquals(GreetingServiceImpl.HI, constructorInjectionController.sayHi());
    }
}

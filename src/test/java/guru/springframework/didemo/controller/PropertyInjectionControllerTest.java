package guru.springframework.didemo.controller;

import guru.springframework.didemo.service.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PropertyInjectionControllerTest {

    private PropertyInjectionController propertyInjectionController;

    @Before
    public void setUp(){
        propertyInjectionController = new PropertyInjectionController();
        propertyInjectionController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testSayHi(){
        Assert.assertEquals(GreetingServiceImpl.HI, propertyInjectionController.sayHi());
    }
}

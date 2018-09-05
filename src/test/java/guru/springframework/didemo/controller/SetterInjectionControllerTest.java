package guru.springframework.didemo.controller;

import guru.springframework.didemo.service.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectionControllerTest {

    private SetterInjectionController setterInjectionController;

    @Before
    public void setUp(){
        setterInjectionController = new SetterInjectionController();
        setterInjectionController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testSayHi(){
        Assert.assertEquals(GreetingServiceImpl.HI, setterInjectionController.sayHi());
    }
}

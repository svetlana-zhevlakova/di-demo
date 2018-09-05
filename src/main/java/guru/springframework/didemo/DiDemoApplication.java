package guru.springframework.didemo;

import guru.springframework.didemo.controller.ConstructorInjectionController;
import guru.springframework.didemo.controller.MyController;
import guru.springframework.didemo.controller.PropertyInjectionController;
import guru.springframework.didemo.controller.SetterInjectionController;
import guru.springframework.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = (MyController) context.getBean("myController");

        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getDbUrl());
    }
}

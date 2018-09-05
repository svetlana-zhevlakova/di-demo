package guru.springframework.didemo;

import guru.springframework.didemo.service.GreetingService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    private GreetingService greetingService;

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleBean Constructor");
    }

    @Autowired
    @Qualifier("setterGreetingServiceImpl")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println("## LifeCycleDemoBean::setGreetingService");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## LifeCycleBean::afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## LifeCycleBean::destroy");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## My Bean Name is: " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## LifeCycleBean::postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## LifeCycleBean::preDestroy");
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }


}

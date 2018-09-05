package guru.springframework.didemo.config;

import guru.springframework.didemo.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    public GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    public GreetingRepository greetingRepository() {
        return new GreetingRepositoryImpl();
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    public GreetingService primaryGreetingServiceImpl(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    public GreetingService primarySpanishGreetingServiceImpl(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("es");
    }

    @Bean
    @Primary
    @Profile("de")
    public GreetingService primaryGermanGreetingServiceImpl(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("de");
    }
}

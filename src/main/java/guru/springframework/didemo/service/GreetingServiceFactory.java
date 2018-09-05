package guru.springframework.didemo.service;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new PrimaryGreetingServiceImpl(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingServiceImpl(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingServiceImpl(greetingRepository);
            default:
                return new PrimaryGreetingServiceImpl(greetingRepository);
        }
    }
}

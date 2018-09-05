package guru.springframework.didemo.service;

public class PrimarySpanishGreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayHi() {
        return greetingRepository.getSpanishGreeting();
    }
}

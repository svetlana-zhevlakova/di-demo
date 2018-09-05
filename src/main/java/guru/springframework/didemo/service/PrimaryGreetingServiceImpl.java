package guru.springframework.didemo.service;

public class PrimaryGreetingServiceImpl implements GreetingService {
    private GreetingRepository greetingRepository;

    public PrimaryGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayHi() {
        return greetingRepository.getEnglishGreeting();
    }
}

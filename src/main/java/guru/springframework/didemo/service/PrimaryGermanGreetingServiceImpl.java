package guru.springframework.didemo.service;

public class PrimaryGermanGreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayHi() {
        return greetingRepository.getGermanGreeting();
    }
}

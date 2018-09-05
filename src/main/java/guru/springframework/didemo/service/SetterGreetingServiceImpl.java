package guru.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHi() {
        return "Hi there! I'm injected by SETTER.";
    }
}

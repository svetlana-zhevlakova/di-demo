package guru.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HI = "Hi there! - Original";

    @Override
    public String sayHi() {
        return HI;
    }
}

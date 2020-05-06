package guru.springframeworkd.sfgdi.controllers;

import guru.springframeworkd.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {

        this.greetingService = greetingService;

    }

    public String getGreeting(){

        return greetingService.sayGreeting();

    }

}
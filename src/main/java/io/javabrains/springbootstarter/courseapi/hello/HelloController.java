package io.javabrains.springbootstarter.courseapi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value="/hello")
    public String saysHi(){
        return "Hi";
    }
}

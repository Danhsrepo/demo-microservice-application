package demo.zuul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ZuulTestController {

    @GetMapping("/hi")
    public String chao() {
        return "hello";
    }
}

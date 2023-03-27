package by.mysite.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyFirstSpringMvcController {

    @GetMapping("/toIndex")
    public String redirectToIndexPage() {
        return "index";
    }

    @GetMapping("/main")
    public String redirectToMainPage() {
        return "some-page";
    }
}

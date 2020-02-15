package pl.sda.zad6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    public static final String PAGE_NAME = "index";

    @GetMapping
    public String page(Model model) {
        model.addAttribute("mojAtrybut", "");
        return PAGE_NAME;
    }

    @PostMapping
    public String postPage(Model model) {
        model.addAttribute("mojAtrybut", "Dane z serwera");
        return PAGE_NAME;
    }

}

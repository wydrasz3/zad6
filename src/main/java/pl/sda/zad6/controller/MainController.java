package pl.sda.zad6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    public static final String PAGE_NAME = "index";

    @GetMapping
    public String page(@RequestParam(value = "button1", required = false) String clickedButton, Model model) {
        if (clickedButton != null) {
            model.addAttribute("mojAtrybut", "Dane z serwera");
        }
        return PAGE_NAME;
    }

//    @PostMapping
//    public String page(@RequestParam("button1") String button, Model model) {
//        return PAGE_NAME;
//    }
}

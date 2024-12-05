package com.example.module5app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    @RequestMapping("/about")
    public String home() {
        return "TEST for MODULE_5_DEVOPS. Alexey Muraviev";
    }

    //Метод, возвращающий квадрат числа
    @GetMapping("/pow2")
    public int pow(@RequestParam(name = "number") int number) {
        return number*number;
    }
}

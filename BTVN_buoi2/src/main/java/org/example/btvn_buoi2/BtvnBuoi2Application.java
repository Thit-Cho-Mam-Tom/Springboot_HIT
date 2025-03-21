package org.example.btvn_buoi2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class BtvnBuoi2Application {

    public static void main(String[] args) {
        SpringApplication.run(BtvnBuoi2Application.class, args);
    }

    @RequestMapping(value = {"/", ""})
    public String home() {
        return "redirect:/employees/select";
    }
}

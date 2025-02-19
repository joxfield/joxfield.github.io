package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
public class Controller {

    @GetMapping
    String getWorkTime(@RequestParam String time) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime localTime = LocalTime.parse(time,formatter);
        return String.format("Czasy Pracy\n13h: %s\n15h: %s\nPauzy\n9h: %s\n11h: %s",localTime.plusHours(13L), localTime.plusHours(15L), localTime.plusHours(9L), localTime.plusHours(11L));
    }
}

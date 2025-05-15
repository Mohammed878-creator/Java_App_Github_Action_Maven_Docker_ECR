package com.example.goodmorning;

import java.time.LocalTime;

public class MessageService {
    public String getGoodMorningMessage(String name) {
        LocalTime now = LocalTime.now();
        String greeting;
        
        if (now.isBefore(LocalTime.NOON)) {
            greeting = "Good Morning";
        } else if (now.isBefore(LocalTime.of(17, 0))) {
            greeting = "Good Afternoon";
        } else if (now.isBefore(LocalTime.of(21, 0))) {
            greeting = "Good Evening";
        } else {
            greeting = "Good Night";
        }
        
        return String.format("%s, %s! Have a wonderful day!", greeting, name);
    }
}
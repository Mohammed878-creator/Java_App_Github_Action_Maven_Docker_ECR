package com.example.goodmorning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageServiceTest {
    @Test
    public void testGoodMorningMessage() {
        MessageService service = new MessageService();
        String result = service.getGoodMorningMessage("Alice");
        assertTrue(result.startsWith("Good") && result.contains("Alice"));
    }
}
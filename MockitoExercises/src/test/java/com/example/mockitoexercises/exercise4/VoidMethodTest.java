package com.example.mockitoexercises.exercise4;

import com.example.mockito.service.NotificationService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class VoidMethodTest {

    @Test
    void testVoidMethod() {

        NotificationService service =
                mock(NotificationService.class);

        doNothing().when(service)
                .sendNotification(anyString());

        service.sendNotification("Welcome");

        verify(service)
                .sendNotification("Welcome");
    }
}
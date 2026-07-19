package com.example.mockitoexercises.exercise7;

import com.example.mockito.service.NotificationService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class VoidExceptionTest {

    @Test
    void testVoidException() {

        NotificationService service =
                mock(NotificationService.class);

        doThrow(new RuntimeException("Error"))
                .when(service)
                .sendNotification(anyString());

        assertThrows(RuntimeException.class, () -> {
            service.sendNotification("Hello");
        });
    }
}
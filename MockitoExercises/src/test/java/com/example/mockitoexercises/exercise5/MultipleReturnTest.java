package com.example.mockitoexercises.exercise5;

import com.example.mockito.external.ExternalApi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MultipleReturnTest {

    @Test
    void testMultipleReturns() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData())
                .thenReturn("First")
                .thenReturn("Second")
                .thenReturn("Third");

        assertEquals("First", api.getData());

        assertEquals("Second", api.getData());

        assertEquals("Third", api.getData());
    }
}
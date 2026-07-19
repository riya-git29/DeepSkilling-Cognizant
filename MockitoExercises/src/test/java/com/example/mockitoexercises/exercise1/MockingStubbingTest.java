package com.example.mockitoexercises.exercise1;

import com.example.mockito.external.ExternalApi;
import com.example.mockito.service.MyService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MockingStubbingTest {

    @Test
    void testMockingAndStubbing() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData()).thenReturn("Mock Data");

        MyService service = new MyService(api);

        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }
}
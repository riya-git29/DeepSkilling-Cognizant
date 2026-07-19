package com.example.mockitoexercises.exercise2;

import com.example.mockito.external.ExternalApi;
import com.example.mockito.service.MyService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class VerifyInteractionTest {

    @Test
    void testVerifyInteraction() {

        ExternalApi api = mock(ExternalApi.class);

        MyService service = new MyService(api);

        service.fetchData();

        verify(api).getData();
    }
}
package com.example.mockitoexercises.exercise3;

import com.example.mockito.external.ExternalApi;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ArgumentMatcherTest {

    @Test
    void testArgumentMatcher() {

        ExternalApi api = mock(ExternalApi.class);

        api.getUser(101);

        verify(api).getUser(anyInt());
    }
}
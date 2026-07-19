package com.example.mockitoexercises.exercise6;

import com.example.mockito.external.ExternalApi;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class VerifyOrderTest {

    @Test
    void testVerifyOrder() {

        ExternalApi api = mock(ExternalApi.class);

        api.getData();
        api.getUser(1);

        InOrder order = inOrder(api);

        order.verify(api).getData();
        order.verify(api).getUser(1);
    }
}
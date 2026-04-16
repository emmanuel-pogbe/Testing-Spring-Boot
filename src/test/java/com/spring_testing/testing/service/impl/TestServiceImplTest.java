package com.spring_testing.testing.service.impl;

import com.spring_testing.testing.repository.TestRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Fail.fail;

@ExtendWith(MockitoExtension.class)
@DisplayName("TestServiceImpl Unit test")
public class TestServiceImplTest {


    @Mock
    private TestRepository testRepository;

    @InjectMocks
    private TestServiceImpl testServiceImpl; // this is the class we want to test

    @Test
    @Disabled
    public void test3() {

    }

    @Nested
    @DisplayName("Testing addition")
    class TestAdditionScenarios {
        @Test
        void shouldTestAddition() {
            // Given
            final int num1 = 1;
            final int num2 = 2;
            // When
            final Integer result = testServiceImpl.addition(num1, num2);
            // Then
            assertNotNull(result);
            assertEquals(3, result);
        }
    }
}


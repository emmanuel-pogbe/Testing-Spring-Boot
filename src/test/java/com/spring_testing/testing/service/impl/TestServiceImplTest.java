package com.spring_testing.testing.service.impl;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Fail.fail;

@ExtendWith(MockitoExtension.class)
@DisplayName("TestServiceImpl Unit test")
public class TestServiceImplTest {

    @Test
    public void test() {
        fail();
    }

    @Test
    public void test2() {

    }

    @Test
    @Disabled
    public void test3() {

    }
}


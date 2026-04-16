package com.spring_testing.testing.service.impl;

import com.spring_testing.testing.service.interfaces.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    public int addition(int a, int b) {
        return a + b;
    }
}

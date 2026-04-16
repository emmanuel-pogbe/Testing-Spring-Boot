package com.spring_testing.testing.service.impl;

import com.spring_testing.testing.model.TestModel;
import com.spring_testing.testing.repository.TestRepository;
import com.spring_testing.testing.service.interfaces.TestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    private final TestRepository testRepository;

    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public TestModel createTest(TestModel testModel) {
        return testRepository.save(testModel);
    }

    @Override
    public List<TestModel> getAllTests() {
        return testRepository.findAll();
    }
}

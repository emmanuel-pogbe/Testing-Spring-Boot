package com.spring_testing.testing.service.interfaces;

import com.spring_testing.testing.model.TestModel;

import java.util.List;

public interface TestService {
    int addition(int a, int b);

    TestModel createTest(TestModel testModel);

    List<TestModel> getAllTests();
}

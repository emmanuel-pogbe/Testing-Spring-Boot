package com.spring_testing.testing.controller;

import com.spring_testing.testing.model.TestModel;
import com.spring_testing.testing.service.interfaces.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tests")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping
    public ResponseEntity<TestModel> createTest(@RequestBody TestModel testModel) {
        TestModel createdTest = testService.createTest(testModel);
        return new ResponseEntity<>(createdTest, HttpStatus.CREATED);
    }

    @GetMapping
    public List<TestModel> getAllTests() {
        return testService.getAllTests();
    }

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return testService.addition(a, b);
    }
}

package com.spring_testing.testing.repository;

import com.spring_testing.testing.model.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestModel, Long> {
}

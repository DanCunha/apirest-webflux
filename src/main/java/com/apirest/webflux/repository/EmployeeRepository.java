package com.apirest.webflux.repository;

import com.apirest.webflux.document.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
}

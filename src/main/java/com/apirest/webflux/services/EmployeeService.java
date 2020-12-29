package com.apirest.webflux.services;

import com.apirest.webflux.document.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

    Flux<Employee> findAll();
    Mono<Employee> findById(String id);
    Mono<Employee> save(Employee employee);
}

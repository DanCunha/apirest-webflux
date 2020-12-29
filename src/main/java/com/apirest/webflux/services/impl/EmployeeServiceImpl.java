package com.apirest.webflux.services.impl;

import com.apirest.webflux.document.Employee;
import com.apirest.webflux.repository.EmployeeRepository;
import com.apirest.webflux.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Flux<Employee> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Employee> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Employee> save(Employee employee) {
        return repository.save(employee);
    }
}

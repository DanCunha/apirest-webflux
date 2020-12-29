package com.apirest.webflux.controller;

import com.apirest.webflux.document.Employee;
import com.apirest.webflux.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping(value = "/employee")
    public Flux<Employee> getEmployeeList() {
        return service.findAll();
    }

    @GetMapping(value = "/employee/{id}")
    public Mono<Employee> getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping(value = "/employee")
    public Mono<Employee> save(@RequestBody Employee employee) {
        return service.save(employee);
    }
}

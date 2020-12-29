package com.apirest.webflux.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@Document
public class Employee {

    private String id;
    private String name;
    private Integer age;
    private BigDecimal salary;

}

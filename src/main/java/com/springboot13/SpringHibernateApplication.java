package com.springboot13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.springboot13.repository")
@EntityScan(basePackages = "com.springboot13.entity")
public class SpringHibernateApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringHibernateApplication.class, args);
    }
}
// POST >  http://localhost:8080/api/user/        
/*
 {
"name": "navaneetha",
"age": 21,
"salary": 45000
}
0/p
{
"id": 1,
"name": "navaneetha",
"age": 21,
"salary": 45000.0
}
-->
update-put> http://localhost:8080/api/user/1  
 
DELETE > http://localhost:8080/api/user/1

retrive all users 

GET> http://localhost:8080/api/user/     
[
    {
        "id": 1,
        "name": "navanee",
        "age": 21,
        "salary": 85000.0
    },
    {
        "id": 2,
        "name": "chitti",
        "age": 21,
        "salary": 47900.0
    },
    {
        "id": 4,
        "name": "don",
        "age": 21,
        "salary": 98000.0
    },
    {
        "id": 5,
        "name": "john",
        "age": 21,
        "salary": 45000.0
    }
]*/
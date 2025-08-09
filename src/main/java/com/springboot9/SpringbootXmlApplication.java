package com.springboot9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootXmlApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootXmlApplication.class, args);
    }
}
/* 
 http://localhost:8080/bookXYZ ->url
 
[
{
    "bookId": 101,
    "name": "Java Tutorials",
    "writer": "Krishna"
},
{
    "bookId": 102,
    "name": "Spring Tutorials",
    "writer": "Mahesh"
},
{
    "bookId": 103,
    "name": "Angular Tutorials",
    "writer": "Shiva"
}
]*/
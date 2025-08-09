package com.springboot8;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}


/*
http://localhost:8080/users
POST
Body tab
Choose: raw
json

{
  "firstName": "Navaneetha",
  "lastName": "Mummadi",
  "age": 22
}
4. Go to Headers tab
Key: Content-Type
Value: application/json
*/
//User received: Navaneetha
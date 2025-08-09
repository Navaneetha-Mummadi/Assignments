package com.task15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.task15")
@EnableJpaRepositories(basePackages = "com.task15.repository")
@EntityScan(basePackages = "com.task15.entity")  
public class Wiprothymeleaf15Application {
    public static void main(String[] args) {
        SpringApplication.run(Wiprothymeleaf15Application.class, args);
    }
}

//http://localhost:8080/clients

/*
 * List of Clients
ID	Name	Email	Phone	Address	Actions
1	Navaneetha	navaneetha@gmail.com	9989889898	andhrapradesh	 
3	pravallika	pravaliika@123	9595959595	hyderabad	 
 */

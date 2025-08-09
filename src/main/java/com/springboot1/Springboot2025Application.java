package com.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springboot2025Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Springboot2025Application.class, args);

        ClassKLM klm = context.getBean(ClassKLM.class);
        klm.run(); 
    }
}
/*
 * 
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.5.4)

2025-08-04T21:30:32.032+05:30  INFO 28516 --- [SpringbootDemo] [           main] com.spring1.Springboot2025Application    : Starting Springboot2025Application using Java 17.0.10 with PID 28516 (C:\Users\bijju\Downloads\SpringbootDependency\SpringbootDemo\target\classes started by navanee in C:\Users\bijju\Downloads\SpringbootDependency\SpringbootDemo)
2025-08-04T21:30:32.040+05:30  INFO 28516 --- [SpringbootDemo] [           main] com.spring1.Springboot2025Application    : No active profile set, falling back to 1 default profile: "default"
2025-08-04T21:30:33.554+05:30  INFO 28516 --- [SpringbootDemo] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2025-08-04T21:30:33.571+05:30  INFO 28516 --- [SpringbootDemo] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-08-04T21:30:33.572+05:30  INFO 28516 --- [SpringbootDemo] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.43]
2025-08-04T21:30:33.690+05:30  INFO 28516 --- [SpringbootDemo] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-08-04T21:30:33.694+05:30  INFO 28516 --- [SpringbootDemo] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1552 ms
2025-08-04T21:30:34.494+05:30  INFO 28516 --- [SpringbootDemo] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2025-08-04T21:30:34.510+05:30  INFO 28516 --- [SpringbootDemo] [           main] com.spring1.Springboot2025Application    : Started Springboot2025Application in 3.182 seconds (process running for 3.799)
Hi... I am ClassABC
*/

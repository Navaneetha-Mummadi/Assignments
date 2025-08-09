package com.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootPropertiesApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootPropertiesApplication.class, args);
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

2025-08-04T21:41:50.715+05:30  INFO 7816 --- [SpringbootDemo] [           main] c.s.SpringbootPropertiesApplication      : Starting SpringbootPropertiesApplication using Java 17.0.10 with PID 7816 (C:\Users\bijju\Downloads\SpringbootDependency\SpringbootDemo\target\classes started by navanee in C:\Users\bijju\Downloads\SpringbootDependency\SpringbootDemo)
2025-08-04T21:41:50.720+05:30  INFO 7816 --- [SpringbootDemo] [           main] c.s.SpringbootPropertiesApplication      : No active profile set, falling back to 1 default profile: "default"
2025-08-04T21:41:52.149+05:30  INFO 7816 --- [SpringbootDemo] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2025-08-04T21:41:52.169+05:30  INFO 7816 --- [SpringbootDemo] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-08-04T21:41:52.169+05:30  INFO 7816 --- [SpringbootDemo] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.43]
2025-08-04T21:41:52.259+05:30  INFO 7816 --- [SpringbootDemo] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-08-04T21:41:52.263+05:30  INFO 7816 --- [SpringbootDemo] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1457 ms
Integer Value: 9876
Decimal Value: 1.75
Boolean Value: true
2025-08-04T21:41:53.194+05:30  INFO 7816 --- [SpringbootDemo] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2025-08-04T21:41:53.208+05:30  INFO 7816 --- [SpringbootDemo] [           main] c.s.SpringbootPropertiesApplication      : Started SpringbootPropertiesApplication in 3.248 seconds (process running for 3.811)
*/

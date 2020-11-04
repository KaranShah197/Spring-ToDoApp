
## Files List  
  
### build.gradle  
  
```java  
plugins {  
    id 'org.springframework.boot' version '2.3.5.RELEASE'  
    id 'io.spring.dependency-management' version '1.0.10.RELEASE'  
    id 'java'
}  
  
group = 'com.springboot.web'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '1.8'  

repositories {  
   mavenCentral()
}  
  
dependencies {  
    implementation 'org.springframework.boot:spring-boot-starter-web' 
    developmentOnly 'org.springframework.boot:spring-boot-devtools' 
    testImplementation('org.springframework.boot:spring-boot-starter-test') { 
	    exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'  
    }
}  
  
test { 
    useJUnitPlatform()
}  
---  
```  
  
### src/main/java/com/springboot/web/todo/TodoApplication.java  
  
```java  
package com.springboot.web.todo;  
  
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
  
@SpringBootApplication  
public class TodoApplication {  
  
 public static void main(String[] args) { SpringApplication.run(TodoApplication.class, args); }  
}  
```  
---  
  
### src/main/resources/application.properties  
  
```  
```  
---  
  
### src/test/java/com/springboot/web/todo/TodoApplicationTests.java  
  
```java  
package com.springboot.web.todo;  
  
import org.junit.jupiter.api.Test;  
import org.springframework.boot.test.context.SpringBootTest;  
  
@SpringBootTest  
class TodoApplicationTests {  
  
 @Test void contextLoads() { }  
}  
  
```  
---  
  
### todo.txt  
  
```  
Spring Boot Starter Parent  
Spring Boot Starter Web  
@SpringBootApplication  
Auto Configuration  
```  
---

## Useful Snippets and References
First Snippet - /src/main/webapp/jsp/login.jsp
```
<html>
<head>
<title>Yahoo!!</title>
</head>
<body>
My First JSP!!!
</body>
</html>
```

Second Snippet - /src/main/resources/application.properties
```
spring.mvc.view.prefix: /jsp/
spring.mvc.view.suffix: .jsp
logging.level.: DEBUG
```

Third Snippet : To enable jsp support in embedded tomcat server!
```
    compile group: 'org.apache.tomcat.embed', name: 'tomcat-embed-jasper', version: '9.0.39'

```

## Files List

### build.gradle

```plugins {
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
   	// https://mvnrepository.com/artifact/org.apache.tomcat.embed/tomcat-embed-jasper
   	compile group: 'org.apache.tomcat.embed', name: 'tomcat-embed-jasper', version: '9.0.39'
   
   	developmentOnly 'org.springframework.boot:spring-boot-devtools'
   	testImplementation('org.springframework.boot:spring-boot-starter-test') {
   		exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'
   	}
   }
   
   test {
   	useJUnitPlatform()
   }

```
---
### src/main/java/com/springboot/web/todo/controller/LoginController.java

```java
package com.springboot.web.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/")
    @ResponseBody
    public static String homePage() {
        return "Default home page";
    }

    @RequestMapping("/index")
    @ResponseBody
    public static String indexPage() {
        return "Default index page test";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }
}
```
---

### src/main/resources/application.properties

```
spring.mvc.view.prefix=/jsp/
spring.mvc.view.suffix=.jsp
logging.level.org.springframework.web=DEBUG
```
---
### src/main/webapp/WEB-INF/jsp/login.jsp

```
<html>

<head>
<title>First Web Application</title>
</head>

<body>
My First JSP!!
</body>

</html>
```
---
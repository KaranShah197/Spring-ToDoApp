## What feature we added during this Step:

- @RequestMapping(value = "/", method = RequestMethod.GET)
    - http://localhost:8080/
- @RequestMapping(value = "/index", method = RequestMethod.GET)
    - http://localhost:8080/index

- Why @ResponseBody?
    - Important of RequestMapping method
    
- How do web applications work? Request and Response
    - Browser sends Http Request to Web Server
    - Code in Web Server => Input:HttpRequest, Output: HttpResponse
    - Web Server responds with Http Response

## Useful Snippets and References
First Snippet

```java
@Controller
public class LoginController {

    @RequestMapping("/")
    @ResponseBody
    public static String homePage() {
        return "Default home page";
    }
}
```
### src/main/resources/application.properties

```
logging.level.org.springframework.web: DEBUG
```


## Files List

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
        return "Default index page";
    }
}
```
---

### src/main/resources/application.properties

```
logging.level.org.springframework.web: DEBUG
```
---
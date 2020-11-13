## Snippets
```
ModelMap model
model.put("name", name);
My First JSP!!! My name is ${name}
```

## Files List

---
### src/main/java/com/springboot/web/todo/controller/LoginController.java

```java
package com.springboot.web.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String loginPage(@RequestParam String name, ModelMap model) {
        System.out.println(" username: "+name);
        model.put("username", name);
        return "login";
    }
}

```
---

### src/main/webapp/jsp/login.jsp

```
<html>
<head>
    <title>Spring Boot - Todo App</title>
</head>
<body>

Welcome, ${username} to Login JSP!!!

</body>
</html>
```
---
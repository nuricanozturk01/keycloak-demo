package nuricanozturk.dev.keycloakdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoController
{
    @GetMapping("/admin")
    public String admin()
    {
        return "Admin page";
    }

    @GetMapping("/user")
    public String user()
    {
        return "User page";
    }
    @GetMapping("/success")
    public String success()
    {
        return "success";
    }

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello, World!";
    }

    @GetMapping("/bye")
    public String bye()
    {
        return "Goodbye, World!";
    }

    @GetMapping("/home")
    public String home() {
        return "Welcome to the home page!";
    }

    @GetMapping("/login-error")
    public String loginError() {
        return "Login failed! Please try again.";
    }
}

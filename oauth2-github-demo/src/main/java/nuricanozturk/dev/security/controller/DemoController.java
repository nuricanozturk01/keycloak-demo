package nuricanozturk.dev.security.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController
{
    @GetMapping
    public String home(final OAuth2AuthenticationToken token)
    {
        System.out.println(token.getPrincipal());
        return "Hello, World!";
    }
}

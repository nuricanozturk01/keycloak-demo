package nuricanozturk.dev.security.config.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class GithubSecurityConfig
{
    @Bean
    public SecurityFilterChain securityFilterChain(final HttpSecurity http) throws Exception
    {
        http.authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests.anyRequest().authenticated())
                .oauth2Login(withDefaults());
        return http.build();
    }

   /* @Bean
    public ClientRegistrationRepository clientRegistrationRepository()
    {
        return new InMemoryClientRegistrationRepository();
    }

    private ClientRegistration clientRegistration()
    {
        return CommonOAuth2Provider.GITHUB.getBuilder("github")
                .clientId("Ov23ctzhHRK404PyrGKJ")
                .clientSecret("").build();
    }*/
}

package pl.mh.bookstore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import pl.mh.bookstore.validator.EmailValidator;

@Configuration
@EnableWebMvc
public class MvcConfig extends WebMvcConfigurerAdapter{

    @Bean
    public EmailValidator emailValidator(){
        return new EmailValidator();
    }
}

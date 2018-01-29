package pl.mh.bookstore.validator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import pl.mh.bookstore.domain.User;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;


public class ValidatorTests {

    private Validator create(){
        LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
        localValidatorFactoryBean.afterPropertiesSet();
        return localValidatorFactoryBean;
    }

    @Test
    public void wrongEmailPattern(){
        User user = new User();
        user.setEmail("hab123gmail.com");

        User user1 = new User();
        user1.setEmail("michalhabigier@gmail.com");

        User user2 = new User();
        user2.setEmail("michalhabigier@//gmail.com");

        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Validator validator = create();
        Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);

        Assert.assertTrue(user1.getEmail().matches(EMAIL_PATTERN));
        Assert.assertFalse(user.getEmail().matches(EMAIL_PATTERN));
        Assert.assertFalse(user2.getEmail().matches(EMAIL_PATTERN));
    }
}

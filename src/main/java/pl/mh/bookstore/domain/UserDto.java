package pl.mh.bookstore.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

public class UserDto {
    @NotEmpty
    private String login;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    private String password;

    @NotNull(message = "password doesn't match")
    private String passwordConfirm;

    @NotEmpty
    private String email;

    @NotEmpty
    private String emailConfirm;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        passwordCheck();
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
        passwordCheck();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        emailCheck();
    }

    public String getEmailConfirm() {
        return emailConfirm;
    }

    public void setEmailConfirm(String emailConfirm) {
        this.emailConfirm = emailConfirm;
        emailCheck();
    }

    private void passwordCheck(){
         if(this.password==null | this.passwordConfirm==null) return;
         else if(!this.password.equals(passwordConfirm)){
             this.password=null;
         }
    }

    private void emailCheck(){
        if(this.email==null | this.emailConfirm==null) return;
        else if(!this.email.equals(emailConfirm)){
            this.emailConfirm=null;
        }
    }
}
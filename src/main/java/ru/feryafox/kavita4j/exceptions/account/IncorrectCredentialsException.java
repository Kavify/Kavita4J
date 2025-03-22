package ru.feryafox.kavita4j.exceptions.account;


public class IncorrectCredentialsException extends Kavita4JAccountException {
    public IncorrectCredentialsException() {
        super("Your credentials are not correct");
    }
}

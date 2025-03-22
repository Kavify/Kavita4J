package ru.feryafox.kavita4j.exceptions.account;

public class InvalidTokenException extends Kavita4JAccountException{
    public InvalidTokenException() {
        super("Invalid token");
    }
}

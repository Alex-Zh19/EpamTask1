package com.epam.alex.exception;

public class ArrayEntityException extends Exception{
    public ArrayEntityException() {
    }
    public ArrayEntityException(String message) {
        super(message);
    }
    public ArrayEntityException(String message, Throwable cause) {
        super(message, cause);
    }
    public ArrayEntityException(Throwable cause) {
        super(cause);
    }
}

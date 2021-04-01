package com.alex.task1.exception;

public class ArrayEntityException extends Exception{
    public ArrayEntityException() { }

    public ArrayEntityException(String message) {
        super(message);
    }

    public ArrayEntityException(Throwable cause, String message) {
        super(message, cause);
    }

    public ArrayEntityException(Throwable cause) {
        super(cause);
    }
}

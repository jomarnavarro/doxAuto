package com.findox.exception;

public class ImplementationMissingException extends Exception {

    public ImplementationMissingException() {
        super("Test Method is lacking implementation");
    }

    public ImplementationMissingException(String msg) {
        super(msg);
    }
}

package com.alves.restful.services.exception;

public class ObjectNotFoundException extends RuntimeException {
    private static final long serialversionUID = 1L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }
}

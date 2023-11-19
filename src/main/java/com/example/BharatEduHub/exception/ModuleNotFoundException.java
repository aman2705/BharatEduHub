package com.example.BharatEduHub.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ModuleNotFoundException extends RuntimeException {
    public ModuleNotFoundException(Integer moduleid){
        super("No Module found with the specified: " + moduleid);
    }
}

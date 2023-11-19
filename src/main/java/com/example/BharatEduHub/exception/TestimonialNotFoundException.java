package com.example.BharatEduHub.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TestimonialNotFoundException extends RuntimeException {
    public TestimonialNotFoundException(Integer userId) {
        super("No testimonial found with the specified " + userId);
    }
}

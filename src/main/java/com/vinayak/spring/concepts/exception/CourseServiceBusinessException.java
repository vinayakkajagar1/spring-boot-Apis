package com.vinayak.spring.concepts.exception;

public class CourseServiceBusinessException extends RuntimeException{

    public CourseServiceBusinessException(String message) {
        super(message);
    }
}

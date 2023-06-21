package com.vinayak.spring.concepts.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})//i want to implement this annotation on field level and parameter(target position)
@Retention(RetentionPolicy.RUNTIME)//i want this annotation to be implemenmted at runtime(only validate this parameter at runTime)
@Documented//standard annotaion
@Constraint(validatedBy = CourseTypeValidator.class)//implementation of this annotation is done in this class
public @interface CourseTypeValidation {

    //you need to add these as these are there in other annotation
    String message() default "Course Type should be either LIVE OR RECORDING";  //you can specify default message

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

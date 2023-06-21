package com.vinayak.spring.concepts.annotation;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class CourseTypeValidator implements ConstraintValidator<CourseTypeValidation,String> { //annotation name , on what field
    @Override
    public boolean isValid(String courseType, ConstraintValidatorContext constraintValidatorContext) {
        List list= Arrays.asList("LIVE","RECORDING");
        return list.contains(courseType); //if this list contains courseType live or recording , if not it will cry
    }
}

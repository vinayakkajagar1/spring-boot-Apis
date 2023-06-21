package com.vinayak.spring.concepts.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.vinayak.spring.concepts.annotation.CourseTypeValidation;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseRequestDTO {

    @NotBlank(message = "Course name shouldn't be NULL OR EMPTY")  //checks both "  " and null
    private String name;
    @NotEmpty(message = "Trainer name should be define") //accepts "  " but dont null
    private String trainerName;
    @NotNull(message = "duration must need to specify") //check for only null
    private String duration; // days
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Past(message = "start date can't be before date from current")
    private Date startDate;
    @CourseTypeValidation
    private String courseType; //Live OR Recodring
    @Min(value = 1500, message = "course price can't be less than 1500")
    @Max(value = 5000, message = "course price can't be more than 5000")
 //   @Size(min = 1500 ,max = 5000)
    private double fees;

    private boolean isCertificateAvailable;
    @NotEmpty(message = "description must be present")
    @Length(min = 5,max = 10)
    private String description;
    @Email(message = "invalid email id")
    private String emailId;
    @Pattern(regexp = "^[0-9]{10}$")
    private String contact;
}

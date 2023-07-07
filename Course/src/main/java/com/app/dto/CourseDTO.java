package com.app.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class CourseDTO {
    @NotBlank(message = "Name is required")
    private String name;

    @NotNull(message = "Category is required")
    private CourseCategory category;

    @NotNull(message = "Start Date is required")
    private LocalDate startDate;

    @NotNull(message = "End Date is required")
    private LocalDate endDate;

    @NotNull(message = "Fee is required")
    private Double fee;
}

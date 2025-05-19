package com.san_stroy.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data

public abstract class TransportDto {
    private Long id;

    @NotBlank(message = "Status is required")
    @Size(min = 3, max = 20, message = "Status must be between 3 and 20 characters")
    private String status; // AVAILABLE, BUSY, INACTIVE
    private String brand;

    @NotNull(message = "year can not be empty")
    private int year;

    @NotNull(message = "Weight can not be empty")
    @Size(min = 1, max = 10, message = "Weight must be between 1 and 10 characters")
    private double weight;

    @NotNull(message = "Height can not be empty")
    @Size(min = 1, max = 10, message = "Height must be between 1 and 10 characters")
    private double height;

    @NotNull(message = "Length can not be empty")
    @Size(min = 1, max = 10, message = "Length must be between 1 and 10 characters")
    private double length;

    @NotNull(message = "Width can not be empty")
    @Size(min = 1, max = 10, message = "Width must be between 1 and 10 characters")
    private double  width;
}


package com.san_stroy.dto.transport_type_dto;

import jakarta.validation.constraints.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data

public class ConcretePumpDto{
    private Long id;

    @NotBlank(message = "Status is required")
    @Size(min = 3, max = 20, message = "Status must be between 3 and 20 characters")
    private String status;

    @NotBlank(message = "Brand is required")
    @Size(min = 2, max = 50, message = "Brand must be between 2 and 50 characters")
    private String brand;

    @NotNull(message = "Year cannot be null")
    @Min(value = 1900, message = "Year must be after 1900")
    @Max(value = 2100, message = "Year must be before 2100")
    private int year;

    @NotNull(message = "Weight cannot be null")
    @Min(value = 1, message = "Weight must be at least 1")
    private double weight;

    @NotNull(message = "Height cannot be null")
    @Min(value = 1, message = "Height must be at least 1")
    private double height;

    @NotNull(message = "Length cannot be null")
    @Min(value = 1, message = "Length must be at least 1")
    private double length;

    @NotNull(message = "Width cannot be null")
    @Min(value = 1, message = "Width must be at least 1")
    private double width;

    @NotNull(message = "Hose length can't be null")
    @Size(min = 1, max = 1000, message = "Hose length must be between 1 and 1000")
    private double hose_length;

    @NotNull(message = "Pump power can't be null")
    @Size(min = 1, max = 1000, message = "Pump power must be between 1 and 1000")
    private double pump_power;
}

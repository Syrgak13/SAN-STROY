package com.san_stroy.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data


public class AdvertisementDto {
    private  Long id;

    @NotBlank
    @Size(min = 5, max = 20)
    private String title;

    private  String description;

    @NotNull(message = "Price can not be null")
    @Min(value = 1)
    private double price;

    @NotNull(message = "Created at can not be null")
    @Size(min = 10, max = 100)
    private LocalDateTime created_at;

    @NotBlank(message = "Location can not be null")
    private  String location;

    private  boolean status;


}

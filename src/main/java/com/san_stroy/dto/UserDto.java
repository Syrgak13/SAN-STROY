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

public class UserDto {
    private Long id;

    @NotBlank(message = "First name cannot be blank")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
    private String firstName;
    private String lastName;

    @NotNull(message = "Email cannot be null")
    @Size(min = 5, max = 50, message = "Email must be between 5 and 50 characters")
    private String email;

    @NotNull(message = "Password cannot be null")
    @Size(min = 6, max = 50, message = "Password must be between 6 and 50 characters")
    private String password;

    @NotNull(message = "Phone number cannot be null")
    private String phoneNumber;

    @NotNull(message = "Role cannot be null")
    private String role; // CUSTOMER, OPERATOR, ADMIN
    private String isActive;




































    
}

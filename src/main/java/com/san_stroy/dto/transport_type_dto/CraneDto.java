package com.san_stroy.dto.transport_type_dto;

import com.san_stroy.dto.TransportDto;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data

public class CraneDto extends TransportDto {
    private Long id;

    @NotNull(message = "Boom length can't be null")
    @Size(min = 1, message = "Boom length can't be empty")
    private double boom_length;
    private double lifting_capacity;


}

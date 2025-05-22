package com.san_stroy.dto.transport_type_dto;

import com.san_stroy.dto.TransportDto;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data


public class BackhoeLoaderDto extends TransportDto {

    private Long id;

    @NotNull(message = "The field is required")
    private double bucket_volume;
}

package com.san_stroy.dto.transport_type_dto;

import com.san_stroy.dto.TransportDto;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data

public class DumpTruckDto extends TransportDto {

    private Long id;

    @NotNull(message = "Load capacity is required")
    private double load_capacity;
}

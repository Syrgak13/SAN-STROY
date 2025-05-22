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

public class ConcretePumpDto extends TransportDto {

    private Long id;

    @NotNull(message = "Hose length can't be null")
    @Size(min = 1, max = 1000, message = "Hose length must be between 1 and 1000")
    private double hose_length;

    @NotNull(message = "Pump power can't be null")
    @Size(min = 1, max = 1000, message = "Pump power must be between 1 and 1000")
    private double pump_power;
}

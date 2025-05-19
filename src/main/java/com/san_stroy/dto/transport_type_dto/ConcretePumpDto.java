package com.san_stroy.dto.transport_type_dto;

import com.san_stroy.dto.TransportDto;
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

public class ConcretePumpDto extends TransportDto {

    private Long id;

    @NotNull(message = "Hose length can't be null")
    @Size(min = 0, max = 1000, message = "Hose length must be between 0 and 1000")
    private double hose_length;

    @NotNull(message = "Pump power can't be null")
    @Size(min = 0, max = 1000, message = "Pump power must be between 0 and 1000")
    private double pump_power;
}

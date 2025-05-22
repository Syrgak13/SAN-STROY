package com.san_stroy.entities.transport_type;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import com.san_stroy.entities.Transport;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConcreteMixer extends Transport {
    @Id
    @GeneratedValue

    private Long id;
    private double drum_value;

}

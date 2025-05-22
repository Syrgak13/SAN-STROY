package com.san_stroy.entities.transport_type;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import com.san_stroy.entities.Transport;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Excavator extends Transport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double bucket_capacity;
}

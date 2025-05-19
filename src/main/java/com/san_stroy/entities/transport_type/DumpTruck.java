package com.san_stroy.entities.transport_type;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DumpTruck extends Transport {
    @Id
    @GeneratedValue

    private Long id;
    private double load_capacity;

}

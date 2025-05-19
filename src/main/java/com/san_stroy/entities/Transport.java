package com.san_stroy.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Transport {
    @GeneratedValue
    @Id
    private Long id;
    private String status; // AVAILABLE, BUSY, INACTIVE
    private String brand;
    private int year;
    private double weight;
    private double height;
    private double length;
    private double  width;
}

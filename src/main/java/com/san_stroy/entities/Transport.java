package com.san_stroy.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Transport {
    @GeneratedValue
    @Id
    private Long id;
    private String status;
    private String brand;
    private int year;
    private double weight;
    private double height;
    private double length;
    private double  width;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @OneToMany(mappedBy = "transport")
    private List<Advertisement> advertisements = new ArrayList<>();
}

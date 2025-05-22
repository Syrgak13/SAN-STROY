package com.san_stroy.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Entity
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)

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
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "transport")
    private List<Advertisement> advertisements = new ArrayList<>();
}


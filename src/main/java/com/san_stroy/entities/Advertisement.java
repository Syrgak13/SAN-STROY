package com.san_stroy.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.batch.BatchTransactionManager;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Advertisement {
    @Id
    @BatchTransactionManager

    private  Long id;
    private String title;
    private  String description;
    private double price;
    private LocalDateTime created_at;
    private  String location;
    private  boolean status;

}

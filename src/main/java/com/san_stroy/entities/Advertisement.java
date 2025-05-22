package com.san_stroy.entities;

import jakarta.persistence.*;
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
    @GeneratedValue
    private Long id;

    private String title;
    private String description;
    private double price;
    private LocalDateTime created_at;
    private String location;
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "transport_id")
    private Transport transport;
}

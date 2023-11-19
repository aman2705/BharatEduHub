package com.example.BharatEduHub.Models;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@Table(name="Modules")
public class Modules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    private String title;
    private String description;
    private Integer seqnum;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public Modules(Integer id, Integer userId, String title, String description, Integer seqnum, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.seqnum = seqnum;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Modules() {
    }

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}

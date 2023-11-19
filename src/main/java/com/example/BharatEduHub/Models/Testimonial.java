package com.example.BharatEduHub.Models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Data
@Entity
@Table(name="TESTIMONIAL")
public class Testimonial  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "photo_path")
    private String photoPath;

    private String name;
    private Integer ctc;
    private String company;
    private String comment;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Testimonial(Integer id, Long userId, String photoPath, String name, Integer ctc, String company, String comment, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.userId = userId;
        this.photoPath = photoPath;
        this.name = name;
        this.ctc = ctc;
        this.company = company;
        this.comment = comment;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Testimonial() {
    }
}

package com.example.BharatEduHub.Models;
import com.example.BharatEduHub.enums.UserRole;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@Entity
@Table(name="USERS")
public class Users  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String username;

    private String email;

    @Enumerated(EnumType.STRING)
    private UserRole role;


    @Column(name = "created_at")
    private LocalDateTime createdAt;


    public Users(Integer id, String username, String email, UserRole role, LocalDateTime createdAt, LocalDateTime updatedAt, List<ScoreBoard> scoreboards) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.role = role;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.scoreboards = scoreboards;
    }

    public Users() {
    }

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<ScoreBoard> scoreboards;
}

package com.example.BharatEduHub.dto;

import com.example.BharatEduHub.Models.Users;
import com.example.BharatEduHub.enums.UserRole;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDTO {
    private Integer id;
    private String username;
    private String email;
    private UserRole role;
    private LocalDateTime createdAt;

    public UserDTO(Integer id, String username, String email, UserRole role, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.role = role;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    private LocalDateTime updatedAt;

    public UserDTO() {

    }

    public static UserDTO fromEntity(Users entity) {
        UserDTO dto = new UserDTO();
        dto.setId(entity.getId());
        dto.setUsername(entity.getUsername());
        dto.setEmail(entity.getEmail());
        dto.setRole(entity.getRole());
        dto.setCreatedAt(entity.getCreatedAt());
        dto.setUpdatedAt(entity.getUpdatedAt());
        return dto;
    }
}

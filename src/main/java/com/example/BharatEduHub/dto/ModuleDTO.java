package com.example.BharatEduHub.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ModuleDTO {
    private Integer id;
    private Integer userId;
    private String title;
    private String description;
    private Integer seqNum;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

package com.example.BharatEduHub.dto;

import lombok.Data;

@Data
public class TestimonialDTO {
    private Long userId;
    private String photoPath;
    private String name;
    private Integer ctc;
    private String company;
    private String comment;

    public TestimonialDTO(Long userId, String photoPath, String name, Integer ctc, String company, String comment) {
        this.userId = userId;
        this.photoPath = photoPath;
        this.name = name;
        this.ctc = ctc;
        this.company = company;
        this.comment = comment;
    }

    public TestimonialDTO() {
    }
}

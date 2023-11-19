package com.example.BharatEduHub.dto;

import lombok.Data;

@Data
public class UpdateTestimonialDTO {
    private String photoPath;
    private String comment;

    public UpdateTestimonialDTO() {
    }

    public UpdateTestimonialDTO(String photoPath, String comment) {
        this.photoPath = photoPath;
        this.comment = comment;
    }
}

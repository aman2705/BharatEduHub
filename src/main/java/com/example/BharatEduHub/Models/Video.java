package com.example.BharatEduHub.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;


@Entity
@Data
@Table(name="VIDEO")
@Builder
public class Video {

    @Id
    private Integer id;
    private Integer teacher_id;
    private Integer batch_id;
    private Integer seq_num;
    private String path;
    private String title;
    private String description;
}

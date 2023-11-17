package com.example.BharatEduHub.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Module")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Modules {
    @Id
    private Integer id;
    private String title;
    private String description;
    private String seqnum;
}

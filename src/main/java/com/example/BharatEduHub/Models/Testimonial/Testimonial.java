package com.example.BharatEduHub.Models.Testimonial;


import com.example.BharatEduHub.Models.Users;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="TESTIMONIAL")
public class Testimonial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int userid;
    private String photopath;
    private String name;
    private int ctc;
    private String company;
    private String comment;


//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "userid")
//    private Users users;
}

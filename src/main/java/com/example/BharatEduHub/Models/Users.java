package com.example.BharatEduHub.Models;

import com.example.BharatEduHub.Models.Testimonial.Testimonial;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="USERS")
public class Users implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String email;
    private String phoneno;
    private String passwordhash;
    private Date createdat;
    private Date updatedat;

    public Users(Integer id, String username, String email, String passwordhash,String phoneno,  Date createdat, Date updatedat) {
        super();
        this.id = id;
        this.username = username;
        this.email = email;
        this.passwordhash = passwordhash;
        this.phoneno=phoneno;
        this.createdat = createdat;
        this.updatedat = updatedat;
    }
//    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Testimonial> testimonials = new ArrayList<>();
}

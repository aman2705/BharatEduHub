package com.example.BharatEduHub.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Scoreboard")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreBoard {

    @Id
    private Integer userid;
    private Integer totalscore;
    private Integer hackerranksolved;
    private Integer codechefsolved;
    private Integer codeforcessolved;
    private Integer leetcodesolved;
    private Integer spojsolved;
    private Integer codechefrating;
    private Integer codeforcesrating;
    private Integer leetcoderating;
}

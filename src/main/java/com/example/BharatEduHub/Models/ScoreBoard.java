package com.example.BharatEduHub.Models;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@Table(name="SCOREBOARD")
public class ScoreBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false,updatable = false,nullable = false)
    private Users user;

    @Column(name = "total_score")
    private Integer totalScore;

    @Column(name = "hackerrank_solved")
    private Integer hackerrankSolved;

    @Column(name = "codechef_solved")
    private Integer codechefSolved;

    @Column(name = "codeforces_solved")
    private Integer codeforcesSolved;

    @Column(name = "leetcode_solved")
    private Integer leetcodeSolved;

    @Column(name = "spoj_solved")
    private Integer spojSolved;

    @Column(name = "codechef_rating")
    private Integer codechefRating;

    @Column(name = "codeforces_rating")
    private Integer codeforcesRating;

    @Column(name = "leetcode_rating")
    private Integer leetcodeRating;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public ScoreBoard() {
    }

    public ScoreBoard(Integer id, Users user, Integer totalScore, Integer hackerrankSolved, Integer codechefSolved, Integer codeforcesSolved, Integer leetcodeSolved, Integer spojSolved, Integer codechefRating, Integer codeforcesRating, Integer leetcodeRating, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.user = user;
        this.totalScore = totalScore;
        this.hackerrankSolved = hackerrankSolved;
        this.codechefSolved = codechefSolved;
        this.codeforcesSolved = codeforcesSolved;
        this.leetcodeSolved = leetcodeSolved;
        this.spojSolved = spojSolved;
        this.codechefRating = codechefRating;
        this.codeforcesRating = codeforcesRating;
        this.leetcodeRating = leetcodeRating;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}

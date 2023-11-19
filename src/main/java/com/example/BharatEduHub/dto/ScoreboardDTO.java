package com.example.BharatEduHub.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ScoreboardDTO {
    private Integer userId;
    private Integer totalScore;
    private Integer hackerrankSolved;
    private Integer codechefSolved;
    private Integer codeforcesSolved;
    private Integer leetcodeSolved;
    private Integer spojSolved;
    private Integer codechefRating;
    private Integer codeforcesRating;
    private Integer leetcodeRating;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

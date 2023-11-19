package com.example.BharatEduHub.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ScoreboardListDTO {

    private List<ScoreboardDTO> scoreboards;

    public ScoreboardListDTO(List<ScoreboardDTO> scoreboards) {
        this.scoreboards = scoreboards;
    }

}

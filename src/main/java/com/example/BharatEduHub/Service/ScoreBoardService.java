package com.example.BharatEduHub.Service;

import com.example.BharatEduHub.Models.ScoreBoard;
import com.example.BharatEduHub.Repository.ScoreBoardRepository;
import com.example.BharatEduHub.dto.ScoreboardDTO;
import com.example.BharatEduHub.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ScoreBoardService {

    @Autowired
    ScoreBoardRepository scoreBoardRepository;
    public List<ScoreboardDTO> getAllScoreboards() {
        List<ScoreBoard> scoreboards = scoreBoardRepository.findAll();
        return scoreboards.stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public ScoreboardDTO getUserScoreboard(Integer userId) {
        Optional<ScoreBoard> optionalScoreboard = scoreBoardRepository.findById(userId);
        if (optionalScoreboard.isEmpty()) {
            throw new UserNotFoundException(userId);
        }

        ScoreBoard scoreboard = optionalScoreboard.get();
        return mapToDto(scoreboard);
    }

    private ScoreboardDTO mapToDto(ScoreBoard scoreboard) {
        ScoreboardDTO scoreboardDto = new ScoreboardDTO();
        scoreboardDto.setUserId(scoreboard.getId());
        scoreboardDto.setTotalScore(scoreboard.getTotalScore());
        scoreboardDto.setHackerrankSolved(scoreboard.getHackerrankSolved());
        scoreboardDto.setCodechefSolved(scoreboard.getCodechefSolved());
        scoreboardDto.setCodeforcesSolved(scoreboard.getCodeforcesSolved());
        scoreboardDto.setLeetcodeSolved(scoreboard.getLeetcodeSolved());
        scoreboardDto.setSpojSolved(scoreboard.getSpojSolved());
        scoreboardDto.setCodechefRating(scoreboard.getCodechefRating());
        scoreboardDto.setCodeforcesRating(scoreboard.getCodeforcesRating());
        scoreboardDto.setLeetcodeRating(scoreboard.getLeetcodeRating());
        scoreboardDto.setCreatedAt(scoreboard.getCreatedAt());
        scoreboardDto.setUpdatedAt(scoreboard.getUpdatedAt());
        return scoreboardDto;
    }


}

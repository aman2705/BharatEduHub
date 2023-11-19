package com.example.BharatEduHub.Controllers;

import com.example.BharatEduHub.Models.ScoreBoard;
import com.example.BharatEduHub.Service.ScoreBoardService;
import com.example.BharatEduHub.dto.ScoreboardDTO;
import com.example.BharatEduHub.dto.ScoreboardListDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bharateduhub")
public class ScoreBoardController {

    @Autowired
    ScoreBoardService scoreBoardService;
    @GetMapping("/api/scoreboards")
    private ResponseEntity<ScoreboardListDTO> getallscoreboards(){
        List<ScoreboardDTO> scoreboards = scoreBoardService.getAllScoreboards();
        ScoreboardListDTO scoreboardListDto = new ScoreboardListDTO(scoreboards);
        return new ResponseEntity<>(scoreboardListDto, HttpStatus.OK);
    }
    @GetMapping("/api/users/{user_id}/scoreboard")
    private ResponseEntity<ScoreboardDTO> getscoreboardofUser(@PathVariable Integer user_id){
        ScoreboardDTO scoreboardDto = scoreBoardService.getUserScoreboard(user_id);
        return new ResponseEntity<>(scoreboardDto, HttpStatus.OK);
    }
}

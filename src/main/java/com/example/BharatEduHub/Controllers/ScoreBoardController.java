package com.example.BharatEduHub.Controllers;

import com.example.BharatEduHub.Models.ScoreBoard;
import com.example.BharatEduHub.Service.ScoreBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
    private List<ScoreBoard> getallscoreboards(){
        return scoreBoardService.getallscroeboards();
    }

    @GetMapping("/api/users/{user_id}/scoreboard")
    private ScoreBoard getscoreboardofUser(@PathVariable Integer user_id){
        return scoreBoardService.getAsingleScoreBoard(user_id);
    }
}

package com.example.BharatEduHub.Service;

import com.example.BharatEduHub.Models.ScoreBoard;
import com.example.BharatEduHub.Repository.ScoreBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ScoreBoardService {

    @Autowired
    ScoreBoardRepository scoreBoardRepository;
    public List<ScoreBoard> getallscroeboards() {
        return scoreBoardRepository.findAll();
    }
    public ScoreBoard getAsingleScoreBoard(Integer user_id){
        return scoreBoardRepository.getReferenceById(user_id);
    }

}

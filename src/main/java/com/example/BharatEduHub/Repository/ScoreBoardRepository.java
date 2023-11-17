package com.example.BharatEduHub.Repository;

import com.example.BharatEduHub.Models.ScoreBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreBoardRepository extends JpaRepository<ScoreBoard,Integer> {
}

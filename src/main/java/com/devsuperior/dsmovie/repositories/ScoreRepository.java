package com.devsuperior.dsmovie.repositories;

import com.devsuperior.dsmovie.entity.Score;
import com.devsuperior.dsmovie.entity.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, ScorePK> { }

package com.AJ.Spring.Projeto_Feirinha.repository;

import com.AJ.Spring.Projeto_Feirinha.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}

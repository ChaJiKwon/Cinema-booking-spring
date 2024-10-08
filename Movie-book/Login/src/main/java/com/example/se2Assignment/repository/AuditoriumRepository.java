package com.example.se2Assignment.repository;

import com.example.se2Assignment.model.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuditoriumRepository extends JpaRepository<Auditorium,Long> {
    List<Auditorium> findByTheaterId(Long theaterId);
}

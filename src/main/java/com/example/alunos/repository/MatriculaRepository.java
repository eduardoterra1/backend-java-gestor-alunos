package com.example.alunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.alunos.entity.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Long>{
    
}

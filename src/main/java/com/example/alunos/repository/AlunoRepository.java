package com.example.alunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.alunos.entity.Aluno;

public interface AlunoRepository extends JpaRepository <Aluno, Long>{
    
}

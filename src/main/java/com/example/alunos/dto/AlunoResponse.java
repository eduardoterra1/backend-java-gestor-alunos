package com.example.alunos.dto;

import java.time.LocalDateTime;
import java.util.List;

public record AlunoResponse(Long id, String name, String telefone, LocalDateTime dataNscimento, List<MatriculaDTO> matriculas) {
}

package com.example.alunos.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    
    @CreatedDate
    @Column(name = "data_inclusao", updatable = false)
    private LocalDateTime dataInclusao;

    @LastModifiedDate
    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;

    public LocalDateTime getDataInclusao(){
        return dataInclusao;
    }

    public LocalDateTime getDataAtualizacao(){
        return dataAtualizacao;
    }
}

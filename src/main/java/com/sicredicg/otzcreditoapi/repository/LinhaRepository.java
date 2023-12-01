package com.sicredicg.otzcreditoapi.repository;


import com.sicredicg.otzcreditoapi.entity.linhas.Linha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinhaRepository extends JpaRepository<Linha, Long> {
}

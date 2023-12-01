package com.sicredicg.otzcreditoapi.repository;

import com.sicredicg.otzcreditoapi.entity.linhas.TipoLinha;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoLinhaRepository extends JpaRepository<TipoLinha, Long> {
}

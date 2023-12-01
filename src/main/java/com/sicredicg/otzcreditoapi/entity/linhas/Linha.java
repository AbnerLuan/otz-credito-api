package com.sicredicg.otzcreditoapi.entity.linhas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sicredicg.otzcreditoapi.entity.variacoes.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Linha implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "linha_id")
    private Long linhaId;

    @Column(name = "nome_linha")
    private String nomeLinha;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "linha")
    private List<DadosCadastroLinha> dadosCadastroLinha;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "grupo_linha_id", referencedColumnName = "grupo_linha_id")
    private GrupoLinha grupoLinha;

}

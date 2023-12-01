package com.sicredicg.otzcreditoapi.entity.linhas;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class GrupoLinha implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grupo_linha_id")
    private Long grupoLinhaId;

    @Column(name = "grupo_linha")
    private String grupoLinha;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "grupoLinha")
    private List<Linha> linha;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "tipo_linha_id")
    private TipoLinha tipoLinha;

}

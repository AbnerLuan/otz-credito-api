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
public class DadosCadastroLinha implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dados_cadastro_linha_id")
    private Long dadosCadastroLinhaId;

    @Column(name = "taxa")
    private String taxa;

//    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
//    @JoinTable(name = "dados_cadastro_linha_prazo_maximo", joinColumns = @JoinColumn(name = "dados_cadastro_linha_id",
//            referencedColumnName = "dados_cadastro_linha_id"), inverseJoinColumns = @JoinColumn(name = "prazo_maximo_id", referencedColumnName = "prazo_maximo_id"))
//    private List<PrazoMaximo> prazoMaximo;

    @Column(name = "prazo_maximo")
    private int prazoMaximo;

    @Column(name = "categoria_produto")
    private String categoriaProduto;

    @Column(name = "codigo_produto")
    private String codigoProduto;

    @Column(name = "composicao")
    private String composicao;

    @Column(name = "finalidade")
    private String finalidade;

    @Column(name = "fonte_recurso")
    private String fonteDeRecurso;

    @Column(name = "empreendimento")
    private String empreendimento;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "linha_id", referencedColumnName = "linha_id")
    private Linha linha;

}

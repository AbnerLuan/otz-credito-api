package com.sicredicg.otzcreditoapi.entity.variacoes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PrazoMaximo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prazo_maximo_id")
    private Long prazoMaximoId;

    @Column(name = "prazo_maximo")
    private int prazoMaximo;

}

package dev.bruno.personCrud.infraestructure.entities;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "assinatura")
public class Assinatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_assinatura", unique = true)
    private String nomeAssinatura;

    @Column(name = "preco_assinatura")
    private BigDecimal precoAssinatura;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private List<Pessoa> pessoas;

}

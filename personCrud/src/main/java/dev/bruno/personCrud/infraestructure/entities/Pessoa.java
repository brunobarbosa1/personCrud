package dev.bruno.personCrud.infraestructure.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email", unique = true)
    private String email;

    @OneToMany
    @JoinColumn(name = "assinatura_id")
    private List<Assinatura> assinatura;

    public void setEmail(String email) {
        if (!email.contains("@") || email.contains("[$#!%¨&*()_-:><,.?/|]")) {
            throw new IllegalArgumentException("Email deve conter @ e não pode ter caracteres especiais");
        }
        this.email = email;
    }
}

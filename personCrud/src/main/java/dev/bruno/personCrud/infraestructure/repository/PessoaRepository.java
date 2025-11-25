package dev.bruno.personCrud.infraestructure.repository;

import dev.bruno.personCrud.infraestructure.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}

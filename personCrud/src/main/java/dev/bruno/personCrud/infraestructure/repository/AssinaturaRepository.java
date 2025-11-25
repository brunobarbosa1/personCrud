package dev.bruno.personCrud.infraestructure.repository;

import dev.bruno.personCrud.infraestructure.entities.Assinatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssinaturaRepository extends JpaRepository<Assinatura, Long> {
}

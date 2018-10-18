package br.seap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.seap.model.Convidado;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {

}

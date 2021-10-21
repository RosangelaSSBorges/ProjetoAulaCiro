package br.agendamedica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.agendamedica.model.PlanoSaude;

@Repository
public interface PlanoSaudeRepository extends JpaRepository<PlanoSaude, Long> {

}
package it.its.maven.maven.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.its.maven.maven.prova.entity.InfoStudente;

@Repository
public interface InfoStudenteRepository extends JpaRepository<InfoStudente, Long> {
}

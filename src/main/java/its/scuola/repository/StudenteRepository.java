package its.scuola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import its.scuola.entity.Studente;

@Repository
public interface StudenteRepository extends JpaRepository<Studente, Long>{
    
}
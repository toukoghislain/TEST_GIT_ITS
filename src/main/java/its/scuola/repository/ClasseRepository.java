package its.scuola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import its.scuola.entity.Classe;

@Repository
public interface ClasseRepository extends JpaRepository<Classe, Long>{
    
}
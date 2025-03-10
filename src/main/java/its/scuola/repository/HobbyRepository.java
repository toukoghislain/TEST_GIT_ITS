package its.scuola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import its.scuola.entity.Hobby;

@Repository
public interface HobbyRepository extends JpaRepository<Hobby, Long>{
    
}
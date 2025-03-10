package its.scuola.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "hobby")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String nome;

    @Column(columnDefinition = "TEXT")
    private String descrizione;
}
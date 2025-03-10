package its.scuola.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table (name="studenti")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Studente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 50)
    private String cognome;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genere genere;

    @Column(nullable = false)
    private int eta;

    @ManyToOne
    @JoinColumn(name = "classe_id", referencedColumnName = "id")
    private Classe classe;
    
    @ManyToOne
    @JoinColumn(name = "hobby_id", referencedColumnName = "id")
    private Hobby hobby;
}
package course.demo.web.Cours.en.ligne.data.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="eleve")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Eleve extends Personne{
    private String classe;
}

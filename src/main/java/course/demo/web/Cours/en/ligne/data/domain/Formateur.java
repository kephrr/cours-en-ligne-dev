package course.demo.web.Cours.en.ligne.data.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="lecon")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Formateur extends Personne{
    private String grade;
}

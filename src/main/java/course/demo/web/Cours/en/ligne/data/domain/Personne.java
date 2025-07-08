package course.demo.web.Cours.en.ligne.data.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="personne")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Personne extends AbstractEntity{
    private String nom;
    private String prenom;
    private String login;
    private String mdp;
}

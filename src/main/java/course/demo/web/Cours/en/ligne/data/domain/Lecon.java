package course.demo.web.Cours.en.ligne.data.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Table(name="lecon")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Lecon extends AbstractEntity{
    private String titre;
    @OneToMany(mappedBy = "lecon")
    private List<Section> sections;
    @ManyToOne
    private Chapitre chapitre;
}

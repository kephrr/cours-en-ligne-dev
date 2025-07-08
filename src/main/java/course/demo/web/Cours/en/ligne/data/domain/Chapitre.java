package course.demo.web.Cours.en.ligne.data.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;


@Entity
@Table(name="chapitre")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Chapitre extends AbstractEntity{
    private String titre;
    @OneToMany(mappedBy = "chapitre")
    private List<Lecon> lecons;
}

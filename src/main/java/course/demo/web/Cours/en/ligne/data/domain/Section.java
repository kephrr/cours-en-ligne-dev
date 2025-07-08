package course.demo.web.Cours.en.ligne.data.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="section")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Section extends AbstractEntity{
    private String titre;
    private String texte;
    private String lien;
    private String image;

    @ManyToOne
    Lecon lecon;
}

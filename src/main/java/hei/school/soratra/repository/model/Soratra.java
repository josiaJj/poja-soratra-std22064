package hei.school.soratra.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Soratra {
    @Id
    String id;
    String soratraContent;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

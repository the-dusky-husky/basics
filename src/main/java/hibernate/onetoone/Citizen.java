package hibernate.onetoone;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by abhisheks on 18-07-2020.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Citizen {

    @Id
    private String uid;
    private String name;
    private String city;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "citizen")
    private AdharCard adharCard;

    public Citizen(String uid, String name, String city, AdharCard adharCard) {
        this.uid = uid;
        this.name = name;
        this.city = city;
        this.adharCard = adharCard;
    }

    public AdharCard getAdharCard() {
        return adharCard;
    }
}

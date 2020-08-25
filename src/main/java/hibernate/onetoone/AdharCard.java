package hibernate.onetoone;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by abhisheks on 18-07-2020.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class AdharCard {

    @Id
    private String adharNumber;
    private String phone;

    @OneToOne
    private Citizen citizen;

    public Citizen getCitizen() {
        return citizen;
    }

    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }

    public AdharCard(String adharNumber, String phone) {
        this.adharNumber = adharNumber;
        this.phone = phone;
    }
}

package hibernate.onetomany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by abhisheks on 11-07-2020.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int userId;
    private String name;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //@JoinTable(name = "Person_Address_Mapping",joinColumns = @JoinColumn(name = "pk1") ,inverseJoinColumns = @JoinColumn(name="pk2"))
    @JoinColumn(name = "PK_FK")
    private List<Mobile> mobiles;


    public Person(int userId, String name, List<Mobile> mobiles) {
        this.userId = userId;
        this.name = name;
        this.mobiles = mobiles;
    }

    public List<Mobile> getMobiles() {
        return mobiles;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setMobiles(List<Mobile> mobiles) {
        this.mobiles = mobiles;
    }
}

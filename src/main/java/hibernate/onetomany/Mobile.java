package hibernate.onetomany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by abhisheks on 11-07-2020.
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Mobile {

    @Id
    private String msisdn;
    private String type;
    private String operator;

    public Mobile(String msisdn, String type, String operator) {
        this.msisdn =msisdn;
        this.type = type;
        this.operator = operator;
    }
}

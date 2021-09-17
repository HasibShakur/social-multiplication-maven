package microservices.book.maven.version.socialmultiplicationmaven.multiplication.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@RequiredArgsConstructor
@Data
@Getter
@ToString
@EqualsAndHashCode
@Entity
public final class Multiplication {
    @Id
    @GeneratedValue
    @Column(name="MULTIPLICATION_ID")
    private Long id;

    //Factors
    private int factorA;
    private int factorB;

    //Result
    private int result;

    public Multiplication(int factorA, int factorB)
    {
        this.factorA = factorA;
        this.factorB = factorB;
        this.result = this.factorA * this.factorB;
    }

}

package microservices.book.maven.version.socialmultiplicationmaven.multiplication.domain;


import lombok.*;

/**
 * This class represents a Multiplication(a*b).
 */

@RequiredArgsConstructor
@Data
@Getter
@ToString
@EqualsAndHashCode
public final class Multiplication {
    //Factors
    private final int factorA;
    private final int factorB;

    Multiplication()
    {
        this(0,0);
    }
}

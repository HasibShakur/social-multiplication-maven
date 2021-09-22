package microservices.book.maven.version.socialmultiplicationmaven.multiplication.domain;

import lombok.*;

/**
 * Identifies the attempt from a {@link User} to solve a {@link Multiplication}
 */
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Data
public final class MultiplicationResultAttempt {
    private final User user;
    private final Multiplication multiplication;
    private final int resultAttempt;

    MultiplicationResultAttempt()
    {
        user = null;
        multiplication = null;
        resultAttempt = 1;
    }
}

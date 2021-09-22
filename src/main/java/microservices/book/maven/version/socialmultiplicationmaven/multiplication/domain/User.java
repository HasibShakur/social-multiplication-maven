package microservices.book.maven.version.socialmultiplicationmaven.multiplication.domain;

import lombok.*;

/**
 * Stores information to identify the user.
 */
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Data
public final class User {
    private final String alias;

    protected User()
    {
        alias = null;
    }
}

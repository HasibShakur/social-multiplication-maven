package microservices.book.maven.version.socialmultiplicationmaven.multiplication.service;

import microservices.book.maven.version.socialmultiplicationmaven.multiplication.domain.Multiplication;
import microservices.book.maven.version.socialmultiplicationmaven.multiplication.domain.MultiplicationResultAttempt;

public interface MultiplicationService {
    /**
     * Creates a random {@link Multiplication} object.
     * @return a Multiplication object with random factors
     */
    Multiplication createRandomMultiplication();

    /**
     * @return true if the attempt matches the result of the multiplication, false otherwise.
     */
    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);
}

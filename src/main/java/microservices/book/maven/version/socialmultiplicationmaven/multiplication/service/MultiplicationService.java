package microservices.book.maven.version.socialmultiplicationmaven.multiplication.service;

import microservices.book.maven.version.socialmultiplicationmaven.multiplication.domain.Multiplication;

public interface MultiplicationService {
    /**
     * Creates a multiplication object with two randomly generated facotrs between 11 and 99
     * @return a Multiplication object with random factors
     */
    public Multiplication createRandomMultiplication();
}

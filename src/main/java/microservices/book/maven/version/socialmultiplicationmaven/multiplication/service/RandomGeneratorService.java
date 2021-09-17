package microservices.book.maven.version.socialmultiplicationmaven.multiplication.service;

public interface RandomGeneratorService {
    /**
     * @return a randomly generated factor between 11 and 99
     */
    int generateRandomFactor();
}

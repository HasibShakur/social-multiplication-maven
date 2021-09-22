package microservices.book.maven.version.socialmultiplicationmaven.multiplication.service;

import microservices.book.maven.version.socialmultiplicationmaven.multiplication.domain.Multiplication;
import microservices.book.maven.version.socialmultiplicationmaven.multiplication.domain.MultiplicationResultAttempt;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationServiceImpl implements MultiplicationService{
    private RandomGeneratorService randomGeneratorService;

    public MultiplicationServiceImpl(final RandomGeneratorService randomGeneratorService)
    {
        this.randomGeneratorService = randomGeneratorService;
    }
    @Override
    public Multiplication createRandomMultiplication()
    {
        int factorA = randomGeneratorService.generateRandomFactor();
        int factorB = randomGeneratorService.generateRandomFactor();

        return new Multiplication(factorA, factorB);
    }

    @Override
    public boolean checkAttempt(final MultiplicationResultAttempt resultAttempt)
    {
        if (resultAttempt.getResultAttempt() == resultAttempt.getMultiplication().getFactorA() * resultAttempt.getMultiplication().getFactorB())
            return true;
        else
            return false;
    }
}

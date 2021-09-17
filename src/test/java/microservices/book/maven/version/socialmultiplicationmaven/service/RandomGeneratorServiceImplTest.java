package microservices.book.maven.version.socialmultiplicationmaven.service;

import microservices.book.maven.version.socialmultiplicationmaven.multiplication.service.RandomGeneratorServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class RandomGeneratorServiceImplTest {
    @Autowired
    private RandomGeneratorServiceImpl randomGeneratorServiceImpl;

    @Before
    public void setUp()
    {
        randomGeneratorServiceImpl = new RandomGeneratorServiceImpl();
    }

    @Test
    public void testGeneratedRandomFactorIsBetweenLimits() throws Exception
    {
        // Generate a sample of random factors
        List<Integer> randomFactors = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int generateRandomFactor = randomGeneratorServiceImpl.generateRandomFactor();
            Integer integer = generateRandomFactor;
            randomFactors.add(integer);
        }
        System.out.println(randomFactors.size());

        // Assert that all of them should be between 11 and 100
        List<Integer> list = new ArrayList<>();
        for (int i = 11; i < 100; i++) {
            Integer integer = i;
            list.add(integer);
        }
        System.out.println(list.size());
        assertThat(randomFactors).containsAll(list);
    }

}

package microservices.book.maven.version.socialmultiplicationmaven.service;

import microservices.book.maven.version.socialmultiplicationmaven.multiplication.domain.Multiplication;
import microservices.book.maven.version.socialmultiplicationmaven.multiplication.service.MultiplicationService;
import microservices.book.maven.version.socialmultiplicationmaven.multiplication.service.RandomGeneratorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.BDDMockito.given;

@SpringBootTest
public class MultiplicationServiceTest {
    @MockBean
    private RandomGeneratorService randomGeneratorService;

    @Autowired
    private MultiplicationService multiplicationService;

    @Test
    public void createRandomMultiplicationTest()
    {
        // given mocked randomGeneratorService returns 50 and 30
        given(randomGeneratorService.generateRandomFactor()).willReturn(50,30);

        // when
        Multiplication multiplication = multiplicationService.createRandomMultiplication();

        // Then
        assertThat(multiplication.getFactorA()).isEqualTo(50);
        assertThat(multiplication.getFactorB()).isEqualTo(30);
        assertThat(multiplication.getResult()).isEqualTo(1500);
    }
}

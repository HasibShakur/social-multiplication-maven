package microservices.book.maven.version.socialmultiplicationmaven.multiplication.service;

import microservices.book.maven.version.socialmultiplicationmaven.multiplication.domain.Multiplication;
import microservices.book.maven.version.socialmultiplicationmaven.multiplication.domain.MultiplicationResultAttempt;
import microservices.book.maven.version.socialmultiplicationmaven.multiplication.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.BDDMockito.given;

public class MultiplicationServiceImplTest {
    private MultiplicationServiceImpl multiplicationServiceImpl;

    @Mock
    private RandomGeneratorService randomGeneratorService;

    @Before
    public void setUp()
    {
        MockitoAnnotations.openMocks(this);
        multiplicationServiceImpl = new MultiplicationServiceImpl(randomGeneratorService);
    }

    @Test
    public void createRandomMultiplicationTest()
    {
        given(randomGeneratorService.generateRandomFactor()).willReturn(50,30);

        Multiplication multiplication = multiplicationServiceImpl.createRandomMultiplication();

        assertThat(multiplication.getFactorA()).isEqualTo(50);
        assertThat(multiplication.getFactorB()).isEqualTo(30);
        assertThat(multiplication.getFactorA()*multiplication.getFactorB()).isEqualTo(1500);
    }

    @Test
    public void checkCorrectAttempt()
    {
        Multiplication multiplication = new Multiplication(50,60);
        User user = new User("Jake Adams");
        MultiplicationResultAttempt multiplicationResultAttempt = new MultiplicationResultAttempt(user, multiplication, 3000);

        //when
        boolean attempt = multiplicationServiceImpl.checkAttempt(multiplicationResultAttempt);

        assertThat(attempt).isTrue();
    }

    @Test
    public void checkWrongAttempt() {
        Multiplication multiplication = new Multiplication(50, 60);
        User user = new User("Jake Adams");
        MultiplicationResultAttempt multiplicationResultAttempt = new MultiplicationResultAttempt(user, multiplication, 3010);

        //when
        boolean attempt = multiplicationServiceImpl.checkAttempt(multiplicationResultAttempt);

        assertThat(attempt).isFalse();
    }
}

package microservices.book.maven.version.socialmultiplicationmaven.multiplication.controller;

import microservices.book.maven.version.socialmultiplicationmaven.multiplication.domain.Multiplication;
import microservices.book.maven.version.socialmultiplicationmaven.multiplication.service.MultiplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/multiplications")
final class MultiplicationController {
    private final MultiplicationService multiplicationService;

    @Autowired
    public MultiplicationController(final MultiplicationService multiplicationService)
    {
        this.multiplicationService = multiplicationService;
    }

    @GetMapping("/random")
    Multiplication getRandomMultiplication()
    {
        return multiplicationService.createRandomMultiplication();
    }
}

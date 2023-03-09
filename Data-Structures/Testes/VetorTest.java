import Vetor.Aluno;
import Vetor.Vetor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VetorTest {

    private Vetor alunosVetor = new Vetor();
    private Throwable exception;

    @BeforeEach
    void preparaVetor() {
        alunosVetor.adicionaAluno(new Aluno("Bruno"));
        alunosVetor.adicionaAluno(new Aluno("Caique"));
        alunosVetor.adicionaAluno(new Aluno("Pedro"));
        alunosVetor.adicionaAluno(new Aluno("Nicolas"));
        alunosVetor.adicionaAluno(new Aluno("Suelen"));
        alunosVetor.adicionaAluno(new Aluno("Giulia"));
    }

    @Test
    void adicionaAluno() {
    }

    @Test
    void retornaAluno() {
    }

    @Test
    void removeAluno() {
    }

    @Test
    void contemAluno() {
    }

}
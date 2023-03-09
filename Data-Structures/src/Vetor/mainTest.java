package Vetor;

public class mainTest {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Bruno");
        Aluno a2 = new Aluno("Paulo");

        Vetor vetor = new Vetor();

        vetor.adicionaAluno(a1);
        vetor.adicionaAluno(a2);

        System.out.println(vetor);
    }
}

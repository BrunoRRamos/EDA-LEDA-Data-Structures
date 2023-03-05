import java.lang.constant.Constable;

public class Aluno {
    private String nome;

    public Aluno() {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return outro.getNome().equals(this.nome);
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
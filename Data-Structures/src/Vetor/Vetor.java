package Vetor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vetor {

    private Aluno[] vetorAlunos = new Aluno[100];
    private int totalAlunos = 0;

    public void adicionaAluno(Aluno aluno) {
        vetorAlunos[totalAlunos] = aluno;
        totalAlunos++;
    }

    public Aluno retornaAluno(int posiscao) {
        return vetorAlunos[posiscao];
    }

    public void removeAluno(int posicao) {
        if (vetorAlunos[posicao] != null) {
            vetorAlunos[posicao] = null;
        }
    }

    public boolean contemAluno(Aluno aluno) {
        for (int i = 0; i < vetorAlunos.length; i++) {
            if (vetorAlunos[i].equals(aluno)) {
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return Arrays.toString(vetorAlunos);
    }

}

package comparator;

public class Produto implements Comparable<Produto> {
    private int codigo;
    private String nome;
    private String descicao;

    public Produto(int codigo, String nome, String descicao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descicao = descicao;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescicao() {
        return this.descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    //Igual retorna 0
    //Maior retorna valor maior que 0
    //menor retorna valor menor que 0
    @Override
    public int compareTo(Produto o) {
        return this.codigo - o.getCodigo();
    }

    @Override
    public boolean equals(Object obj) {
        boolean resp = false;
        if (obj instanceof Produto) {
            resp = this.compareTo((Produto) obj) == 0;
        }
        return resp;
    }
}

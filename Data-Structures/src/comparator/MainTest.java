package comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class MainTest {
    public static void main(String[] args) {
        ArrayList<Produto> arrProdutos = new ArrayList<>();

        Produto p1 = new Produto(1, "feijao", "verde");
        Produto p2 = new Produto(2, "abóbora", "fresca");
        Produto p3 = new Produto(3, "milho", "verde");
        Produto p4 = new Produto(4, "arroz", "integral");
        Produto p5 = new Produto(5, "queijo", "mussarela");
        Produto p6 = new Produto(6, "leite", "fresco");

        arrProdutos.add(p6);
        arrProdutos.add(p4);
        arrProdutos.add(p5);
        arrProdutos.add(p2);
        arrProdutos.add(p3);
        arrProdutos.add(p1);

        arrProdutos.sort( (o1, o2) -> o1.getCodigo() - o2.getCodigo() );

        int i = 0;
    }
}

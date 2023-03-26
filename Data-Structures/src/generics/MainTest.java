package generics;

public class MainTest {
    public static void main(String[] args) {
        MinhaListaImplement<String> list = new MinhaListaImplement<>();
        MinhaListaImplement<Integer> listInteger = new MinhaListaImplement<>();

        list.add("2");
        list.remove("2");

        listInteger.add(1);
        listInteger.remove(1);

    }
}

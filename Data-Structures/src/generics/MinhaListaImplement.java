package generics;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MinhaListaImplement<Type> implements MinhaLista<Type> {
    private ArrayList listaInterna = new ArrayList();

    @Override
    public void add(Type o) {
        listaInterna.add(o);
    }

    @Override
    public void remove(Type o) {
        listaInterna.remove(o);
    }
}

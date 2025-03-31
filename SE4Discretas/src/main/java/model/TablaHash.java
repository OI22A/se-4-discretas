package model;
import java.util.HashMap;

public class TablaHash {
    HashMap<Integer, Integer> mapa;

    public TablaHash() {
        this.mapa = new HashMap<>();
    }

    public void insertar(int clave, int valor) {
        mapa.put(clave, valor);
    }

    public boolean contieneClave(int clave) {
        return mapa.containsKey(clave);
    }

    public int obtener(int clave) {
        return mapa.get(clave);
    }
}

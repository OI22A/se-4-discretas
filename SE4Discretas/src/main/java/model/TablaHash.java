package model;

public class TablaHash<K, V> {
    private int size;
    private ListaEnlazada arreglo;

    public TablaHash() {
        this.size = 0;
    }

    public void Insertar(K clave, V valor) {

    }

    public int obtenerIndice(K clave) {
        return Math.abs(clave.hashCode() % size);
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

package model;

public class TablaHash {
    private static class Entrada {
        int clave;
        int valor;
        Entrada siguiente;

        Entrada(int clave, int valor) {
            this.clave = clave;
            this.valor = valor;
            this.siguiente = null;
        }
    }

    private static final int TAMANO = 1000;
    private Entrada[] tabla;

    public TablaHash() {
        this.tabla = new Entrada[TAMANO];
    }

    private int hash(int clave) {
        return Math.abs(clave) % TAMANO;
    }

    public void insertar(int clave, int valor) {
        int indice = hash(clave);
        Entrada nuevaEntrada = new Entrada(clave, valor);

        if (tabla[indice] == null) {
            tabla[indice] = nuevaEntrada;
        } else {
            Entrada actual = tabla[indice];
            while (actual.siguiente != null) {
                if (actual.clave == clave) {
                    actual.valor = valor;
                    return;
                }
                actual = actual.siguiente;
            }
            actual.siguiente = nuevaEntrada;
        }
    }

    public boolean contieneClave(int clave) {
        int indice = hash(clave);
        Entrada actual = tabla[indice];

        while (actual != null) {
            if (actual.clave == clave) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public int obtener(int clave) {
        int indice = hash(clave);
        Entrada actual = tabla[indice];

        while (actual != null) {
            if (actual.clave == clave) {
                return actual.valor;
            }
            actual = actual.siguiente;
        }
        return -1;
    }
}

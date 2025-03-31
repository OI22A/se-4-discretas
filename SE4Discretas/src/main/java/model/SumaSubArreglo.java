package model;

public class SumaSubArreglo {
    public static void encontrarSubarreglo(int[] arr, int S) {
        TablaHash tabla = new TablaHash();
        int sumaActual = 0;

        for (int i = 0; i < arr.length; i++) {
            sumaActual += arr[i];

            if (sumaActual == S) {
                System.out.println("Subarreglo encontrado: [" + indicesComoLista(0, i) + "]");
                return;
            }

            if (tabla.contieneClave(sumaActual - S)) {
                int inicio = tabla.obtener(sumaActual - S) + 1;
                System.out.println("Subarreglo encontrado: [" + indicesComoLista(inicio, i) + "]");
                return;
            }

            tabla.insertar(sumaActual, i);
        }

        System.out.println("No se encontró un subarreglo con la suma " + S);
    }

    private static String indicesComoLista(int inicio, int fin) {
        StringBuilder sb = new StringBuilder();
        for (int i = inicio; i <= fin; i++) {
            sb.append(i);
            if (i < fin) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}


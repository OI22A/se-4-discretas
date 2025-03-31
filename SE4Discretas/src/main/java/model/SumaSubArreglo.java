package model;

public class SumaSubArreglo {
    public String encontrarSubarreglo(int[] arr, int S) {
        TablaHash tabla = new TablaHash();
        int sumaActual = 0;
        String msg="";

        for (int i = 0; i < arr.length; i++) {
            sumaActual += arr[i];

            if (sumaActual == S) {
                msg += ("Subarreglo encontrado: [" + indicesComoLista(0, i) + "]");
                return msg;
            }

            if (tabla.contieneClave(sumaActual - S)) {
                int inicio = tabla.obtener(sumaActual - S) + 1;
                msg += indicesComoLista(inicio, i) + "]";
                return msg;
            }

            tabla.insertar(sumaActual, i);
        }

        msg+="No se encontró un subarreglo con la suma " + S;
        return msg; 
    }

    public String indicesComoLista(int inicio, int fin) {
        String result = "";
        
        for (int i = inicio; i <= fin; i++) {
            result += i;
            if (i < fin) {
                result += ",";
            }
        }
        
        return result;
    }
}

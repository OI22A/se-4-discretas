package ui;

import model.SumaSubArreglo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Ingrese la suma objetivo: ");
        int S = scanner.nextInt();

        SumaSubArreglo.encontrarSubarreglo(arr, S);

        scanner.close();
    }
}


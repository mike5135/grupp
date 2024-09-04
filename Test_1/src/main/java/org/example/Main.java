package org.example;

public class Main {

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 9};

        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    // Metod för att returnera arrayen
    public static int[] getArray() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 8, 9};
    }
}

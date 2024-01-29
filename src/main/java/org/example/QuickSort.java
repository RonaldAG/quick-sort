package org.example;

public class QuickSort {

    private static void exchange(Comparable[] a, int i, int j) {
        Comparable aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }

    private static boolean less(Comparable comparable, Comparable comparable1) {
        return comparable.compareTo(comparable1) < 0;
    }

    private static int partition(Comparable[] a, int low, int high) {
        int i = low, j = high + 1;

        while (true){
            while (less(a[++i], a[low]))
                if (i == high) break;

            while (less(a[low], a[--j]))
                if (j == low) break;

            if (i >= j) break;
            exchange(a, i, j);
        }
        exchange(a, low, j);
        return j;
    }

    private static void sort(Comparable[] a, int low, int high){
        if (low >= high) return;
        int index = partition(a, low, high);
        sort(a, low, index - 1);
        sort(a, index + 1, high);
    }

    public static void sort(Comparable[] a){
        sort(a, 0, a.length - 1);
    }

}

package de.neuefische.arrays;

public class ArrayTask {

    public static String[] fillArray(int n) {
        String[] a = new String[n];
        for (int i=0; i<n; i++) {
            a[i] = "Student " + i;
        }
        return a;
    }

}

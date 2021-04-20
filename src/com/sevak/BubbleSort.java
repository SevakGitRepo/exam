package com.sevak;

public class BubbleSort {
    static Taxi[] sort(Taxi[] array) {
        boolean cycle = false;
        Taxi current = new Taxi();
        while (!cycle) {

            cycle = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].getYear() > array[i + 1].getYear()) {
                    current = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = current;
                    cycle = false;
                }
            }
        }
        return array;
    }
}

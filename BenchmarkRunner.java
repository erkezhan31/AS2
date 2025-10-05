package cli;

import algorithms.InsertionSort;

import java.util.Random;

public class BenchmarkRunner {

    public static void main(String[] args) {
        int n = 1000;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }

        int[] array = generateRandomArray(n);
        InsertionSort sorter = new InsertionSort();

        long start = System.nanoTime();
        sorter.sort(array);
        long end = System.nanoTime();

        System.out.println("Array size: " + n);
        System.out.println("Execution time (ms): " + ((end - start) / 1_000_000.0));
        System.out.println(sorter.getTracker());
    }

    private static int[] generateRandomArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n * 10);
        }
        return arr;
    }
}

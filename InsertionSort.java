package algorithms;

import metrics.PerformanceTracker;

public class InsertionSort {

    private final PerformanceTracker tracker;

    public InsertionSort() {
        this.tracker = new PerformanceTracker();
    }

    public PerformanceTracker getTracker() {
        return tracker;
    }

    public void sort(int[] array) {
        if (array == null || array.length < 2) return;

        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            tracker.incrementArrayAccess();

            int j = i - 1;

            while (j >= 0 && compare(array[j], key) > 0) {
                array[j + 1] = array[j];
                tracker.incrementArrayAccess();
                j--;
            }
            array[j + 1] = key;
            tracker.incrementArrayAccess();
        }
    }

    private int compare(int a, int b) {
        tracker.incrementComparison();
        return Integer.compare(a, b);
    }
}

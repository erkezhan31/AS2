package metrics;


public class PerformanceTracker {
    private long comparisons = 0;
    private long swaps = 0;
    private long arrayAccesses = 0;

    public void incrementComparison() { comparisons++; }
    public void incrementSwap() { swaps++; }
    public void incrementArrayAccess() { arrayAccesses++; }

    public long getComparisons() { return comparisons; }
    public long getSwaps() { return swaps; }
    public long getArrayAccesses() { return arrayAccesses; }

    public void reset() {
        comparisons = 0;
        swaps = 0;
        arrayAccesses = 0;
    }

    @Override
    public String toString() {
        return "PerformanceTracker{" +
                "comparisons=" + comparisons +
                ", swaps=" + swaps +
                ", arrayAccesses=" + arrayAccesses +
                '}';
    }
}

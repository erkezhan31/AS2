# Assignment 2 - Insertion Sort

## Project Structure
- `algorithms/InsertionSort.java` - optimized insertion sort with performance tracking
- `metrics/PerformanceTracker.java` - tracks comparisons, swaps, array accesses
- `cli/BenchmarkRunner.java` - run benchmarks via CLI
- `test/InsertionSortTest.java` - unit tests covering edge cases

## Run Benchmark
```
mvn compile
mvn exec:java -Dexec.mainClass="cli.BenchmarkRunner" -Dexec.args="10000"
```

## Notes
- Optimized for nearly sorted arrays
- Tracks comparisons, swaps, and array accesses
- JUnit 5 tests included

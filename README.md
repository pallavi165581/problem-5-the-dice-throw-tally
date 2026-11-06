# Problem 5: The Dice Throw Tally

SRM SEM-3 · CodInClub — Category C · Sorting Algorithms (Java, no `Arrays.sort`).

Counting sort for dice values 1–6: a `count[7]` array tallies each face
(no two throws are ever compared), the counts are printed, then each
value `v` is written into the result `count[v]` times.

## Run

```sh
cd src
javac DiceThrowTally.java
java DiceThrowTally
```

Tests the sample input plus one extra input.

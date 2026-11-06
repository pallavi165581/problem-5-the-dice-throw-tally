import java.util.Arrays;

/**
 * Problem 5: The Dice Throw Tally
 *
 * Counting sort for dice values 1..6 — no Arrays.sort and no throw is
 * ever compared with another. A count array of size 7 records how many
 * times each face appeared; the counts are printed, then each value v
 * is written into the result count[v] times, v = 1..6.
 *
 * Time: O(n + 6) = O(n). Space: O(1) extra besides the output array
 * (the count table has a fixed size of 7).
 */
public class DiceThrowTally {

    public static int[] diceSort(int[] rolls) {
        int[] count = new int[7]; // index 0 unused; 1..6 are the faces
        for (int r : rolls) {
            count[r]++;
        }

        StringBuilder sb = new StringBuilder("Counts: ");
        for (int v = 1; v <= 6; v++) {
            sb.append(v).append(":").append(count[v]);
            if (v < 6) {
                sb.append("  ");
            }
        }
        System.out.println(sb);

        int[] sorted = new int[rolls.length];
        int k = 0;
        for (int v = 1; v <= 6; v++) {
            for (int t = 0; t < count[v]; t++) {
                sorted[k++] = v;
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] sorted = diceSort(new int[]{4, 1, 6, 4, 2, 1, 4});
        // Counts: 1:2  2:1  3:0  4:3  5:0  6:1
        System.out.println("Sorted: " + Arrays.toString(sorted));
        // Sorted: [1, 1, 2, 4, 4, 4, 6]

        System.out.println("Own input:");
        int[] own = diceSort(new int[]{6, 6, 3, 5, 1, 3});
        System.out.println("Sorted: " + Arrays.toString(own));
    }
}

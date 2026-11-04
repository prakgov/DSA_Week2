import java.util.ArrayList;
import java.util.HashSet;

public class TaskSolutions implements PracticeTasks {

    @Override
    public int getUncommonElementsCount(ArrayList<Integer> numbersToCheck, ArrayList<Integer> originalNumbers) {
        // Practice Task 8
        // Pseudo Code, Time Complexity and Edge Cases
        /*
         * set = HashSet built from B
         * removed_count = 0
         * i = 0
         * while i < A.size:
         *     if set contains A[i]:
         *         i = i + 1
         *     else:
         *         remove A at index i
         *         removed_count = removed_count + 1
         *         (i stays the same)
         * return removed_count
         *
         * Time Complexity: O(n)
         *
         * Edge Cases:
         * Empty B	            -->     Every element of A is removed
         * Duplicates in A	    -->     Kept when the value is in B
         * Null in B	        -->     The set holds null, so a null in A is kept
         * Null in A, none in B -->	    Removed like any other missing elements
         * */

        HashSet<Integer> originalSet = new HashSet<>(originalNumbers);
        int removed_count = 0;
        int i = 0;
        while (i < numbersToCheck.size()) {
            if (originalSet.contains(numbersToCheck.get(i))) {
                i++;
            } else {
                numbersToCheck.remove(i);
                removed_count += 1;
            }
        }
        return removed_count;
    }
}

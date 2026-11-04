import java.util.ArrayList;

public class TRAI_26_X2_prakigov implements TRAI_26_X2 {
    /**
     * SELF-EVALUATION HERE:
     * Understanding the algorithm and spotting the pattern was straight-forward.
     * Implementing the design with edge cases and efficiency in mind, was a bit time consuming.
     * However, once the pseudocode was clear with the validations to guard all the edge cases, the solution slowly
     started to get clear.
     * While loop was ideal to use than a nested for loop since the list is already sorted and this helps to achieve
     linear time complexity, O(n).
     *
     */


    /**
     * Union of two lists that are in ascending order.
     * <p>
     * Returns a new list that contains all the elements that are in list1 and/or in list1,
     * Each element will be in result list only once, even it is in list1 and/or list2
     * several times.
     * The result list will be in ascending order.
     * If either of the lists is not in ascending order, the result can be anything.
     *
     * @param list1 first input list, elements in ascending order
     * @param list2 second input list, elements in ascending order
     * @return intersection list, elements in ascending order
     */
    @Override
    public ArrayList<Integer> unionOfSortedLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        /* Pseudo Code
         * result = empty list;
         * initialise pointers i, j = 0
         * while i < A.size OR j < B.size:
         *   initialise empty current integer
         *   validate for list1/list2 being exhausted and increment i or j, store in current
         *   pick smaller element (take from the non-exhausted list if one is exhausted), store in current, increment
         i or j;
         *   increment both pointers if the elements are equal
         *   add to result only if result is empty or it is not same as result's last element
         * return result

         * Time Complexity:
         * O(n + m) where n = list1.size and m = list2.size
         * Space Complexity:
         * O(n + m) for the result list

         * Edge Cases:
         *   One list empty             -> other list returned without duplicates
         *   Both lists empty           -> empty list returned
         *   Identical lists            -> copy without duplicates
         *   Same starting element      -> added once, the rest processed as usual
         *   Duplicates inside one list -> removed by the guarded add
         *
         * */
        // use the fact that the lists are in ascending order _already_ in the plan!
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (list1.size() > i || list2.size() > j) {
            int current;

            if (i == list1.size()) {                      // list1 is exhausted
                current = list2.get(j);
                j++;
            } else if (j == list2.size()) {               // list2 is exhausted
                current = list1.get(i);
                i++;
            } else if (list1.get(i) < list2.get(j)) {     // list1 element is smaller
                current = list1.get(i);
                i++;
            } else if (list1.get(i) > list2.get(j)) {     // list2 element is smaller
                current = list2.get(j);
                j++;
            } else {                                    // both lists have same element
                current = list1.get(i);
                i++;
                j++;
            }

            if (result.isEmpty() || result.get(result.size() - 1) != current) {
                result.add(current);
            }
        }
        return result;
    }
}

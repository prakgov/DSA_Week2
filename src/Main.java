import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        // Practice Task 8
        TaskSolutions ts = new TaskSolutions();
        ArrayList<Integer> originalNumbers = new ArrayList<Integer>();
        originalNumbers.add(33);
        originalNumbers.add(15);
        originalNumbers.add(20);
        originalNumbers.add(34);
        originalNumbers.add(8);
        originalNumbers.add(12);
        ArrayList<Integer> numbersToCheck = new ArrayList<Integer>();
        numbersToCheck.add(15);
        numbersToCheck.add(23);
        numbersToCheck.add(34);
        int result = ts.getUncommonElementsCount(numbersToCheck, originalNumbers);
        System.out.println("Uncommon elements: " + result);
        System.out.println("After removing uncommon elements: " + numbersToCheck);

        // Task X2
        TRAI_26_X2_prakigov trai = new TRAI_26_X2_prakigov();
        ArrayList<Integer> sortedListA = new ArrayList<>();
        sortedListA.add(2);
        sortedListA.add(4);
        sortedListA.add(6);
        sortedListA.add(7);
        ArrayList<Integer> sortedListB = new ArrayList<>();
        sortedListB.add(1);
        sortedListB.add(3);
        sortedListB.add(5);
        System.out.println("Lists before union: " + sortedListA + " and " + sortedListB);
        ArrayList<Integer> unionResult = trai.unionOfSortedLists(sortedListA, sortedListB);
        System.out.println("Union of the two lists: " + unionResult);
    }
}

import java.util.*;

public class MainList {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        Set<Integer> mySet = new HashSet<>();

        myList.add(5);
        myList.add(1);
        myList.add(2);
        myList.add(5);

        mySet.add(5);
        mySet.add(1);
        mySet.add(2);
        mySet.add(5);

        System.out.println("List: " + myList);
        System.out.println("Set: " + mySet);
    }
}

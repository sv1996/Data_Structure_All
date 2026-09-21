package Arrays;

import java.util.*;

public class RemoveDuplicateUsingLinkedHashSet {
    public static void main(String[] args) {
        Integer arr[] = {1,1,2,3,3,4};
        List<Integer> arrayList = Arrays.asList(arr);
        List<Integer> newArrayList1 =removeDuplicatesUsingLinkedHashSet(arrayList);
        System.out.println("Removing Duplicates with Set Method");
        newArrayList1.forEach((b)-> System.out.print(b+" "));
    }
    private static  List<Integer> removeDuplicatesUsingLinkedHashSet(List<Integer> arrayList) {
        Set<Integer> s = new LinkedHashSet<Integer>();

        s.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(s);
        return arrayList;
    }

}

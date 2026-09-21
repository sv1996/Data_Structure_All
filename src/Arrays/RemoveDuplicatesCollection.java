package Arrays;

import java.util.*;
import java.util.ArrayList;

public class RemoveDuplicatesCollection {
    public static void main(String[] args) {
        Integer arr[] = {0,0,1,1,1,2,2,3,3,4};
        List<Integer> arrayList = Arrays.asList(arr);
        List<Integer> newArrayList =removeDuplicatesUsingList(arrayList);
        System.out.println("Removing Duplicates with List Method");
        newArrayList.forEach((a)-> System.out.print(a+" "));
        System.out.println("Size Of the List");
        System.out.println(newArrayList.size());

       // List<Integer> newArrayList1 =removeDuplicatesUsingLinkedHashSet(arrayList);
        //System.out.println("Removing Duplicates with Set Method");
       // newArrayList1.forEach((b)-> System.out.print(b+" "));
    }


    private static List<Integer> removeDuplicatesUsingList(List<Integer> al) {

    List<Integer> newList = new ArrayList<>();

    for(Integer element: al)
    {
        if(!newList.contains(element))
        {
            newList.add(element);
        }
    }

  return newList;

    }
}

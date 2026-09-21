package Java8Streams.Java8Coding;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class MainMethod {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Zwayam");
        fruits.add("Oranges");
        fruits.add("Banana");
        // I need to sort using streams in ascending order
        List<String> sortedList=  fruits.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println(sortedList);
        System.out.println("Using another methods");
        List<String > newSortedList = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).toList();
        System.out.println(newSortedList);
        // descending order
        System.out.println("--- Descending Order ---");
        List<String> sortedListDesc=  fruits.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedListDesc);
        System.out.println("--- New Descending Order ---");
        List<String> sortedListDescNew=  fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).toList();
        System.out.println(sortedListDescNew);
    }
}

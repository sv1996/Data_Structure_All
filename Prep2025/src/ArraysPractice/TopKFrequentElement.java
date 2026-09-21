package ArraysPractice;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElement {


    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1};
        int k = 2;

//        Explanation: Frequency of 4 is 2 and frequency of 1 is 2, these two have the maximum frequency.
//
//                Input: arr[] = [7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9], k = 4
//        Output: [5, 11, 7, 10]
//        Explanation: Frequency of 5 is 3, frequency of 11 is 2, frequency of 7 is 2, and frequency of rest is 1  but 10 is largest

       int ans [] = findTopKFrequentNumber(arr, k);
        System.out.println("Answer is :: ");
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }

    }
    private static int [] findTopKFrequentNumber(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans  [] = new int [k];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // sort the map into based on value
        Map<Integer, Integer> sortedMap =
                map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new
                        ));
        int j = 0;
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            ans[j] = entry.getKey();
            j++;
            if (j == k) {
                break;
            }
        }
        return ans;
    }
}

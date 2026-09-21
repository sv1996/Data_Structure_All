package ArraysPractice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementInArray {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        HashMap<Integer, Integer> frequencyMap = countFrequency(arr);

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }




    }



    private static HashMap<Integer, Integer> countFrequency(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        return frequencyMap;

    }


}

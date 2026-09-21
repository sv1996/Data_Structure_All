package ArraysPractice;

import java.util.HashMap;
import java.util.Map;


class FrequencyResult {
int HighestFrequencyNumber;
int LowestFrequencyNumber;

    FrequencyResult(int highestFrequencyNumber, int lowestFrequencyNumber) {
        HighestFrequencyNumber = highestFrequencyNumber;
        LowestFrequencyNumber = lowestFrequencyNumber;
    }

}



public class HighestFrequencyNumberReturn {



    public static void main(String[] args) {
        int arr[] = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        HashMap<Integer, Integer> frequencyMap = countFrequency(arr);

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        FrequencyResult frequencyResult =  getHighestFrequencyNumber(frequencyMap);
        System.out.println("Number with highest frequency: " + frequencyResult.HighestFrequencyNumber);
        System.out.println("Number with lowest frequency: " + frequencyResult.LowestFrequencyNumber);



    }

    private static FrequencyResult getHighestFrequencyNumber(HashMap<Integer, Integer> frequencyMap) {
        int highestFrequency = Integer.MIN_VALUE;
        int MaxFrequencyNumber =-1;
        int loswestFrequcny = Integer.MAX_VALUE;
        int MinFrequencyNumber = -1;

        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet())
        {
            if(entry.getValue()>highestFrequency)
            {
                highestFrequency = entry.getValue();
                MaxFrequencyNumber = entry.getKey();
            }

            if(entry.getValue()<loswestFrequcny)
            {
                loswestFrequcny = entry.getValue();
                MinFrequencyNumber = entry.getKey();
            }
        }

        return new FrequencyResult(MaxFrequencyNumber, MinFrequencyNumber);

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

package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public static void main(String[] args) {
//        Given an array of strings strs, group the anagrams together. You can return the answer in any order.

//
//        Input: strs = ["eat","tea","tan","ate","nat","bat"]
//
//        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//
//        Explanation:
//
//        There is no string in strs that can be rearranged to form "bat".
//                The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
//                The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
//                Example 2:
//
//        Input: strs = [""]
//
//        Output: [[""]]

        String[] stringList = {"eat", "tea", "tan", "ate", "nat", "bat"};
        java.util.List<List<String>> al = groupAnagrams(stringList);
        System.out.println(al);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        // make a hashmap
        // sort the same strings n all
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String currString = s;
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

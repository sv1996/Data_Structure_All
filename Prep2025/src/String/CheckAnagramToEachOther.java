package String;

import java.util.HashMap;

public class CheckAnagramToEachOther {

    public static void main(String[] args) {
//        Example 1:
//
//        Input: s = "anagram", t = "nagaram"
//
//        Output: true
//
//        Example 2:
//
//        Input: s = "rat", t = "car"
//
//        Output: false
        String str1 = "rat";
        String str2 = "car";
       if(chekAnagram(str1, str2))
       {
           System.out.println("Both strings are anagram to each other");
       } else
       {
           System.out.println("Both strings are not anagram to each other");
       }


    }

    private static boolean chekAnagram(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        if(n1 != n2)
        {
            return false;
        }
        // using frequency
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0;i<n1;i++) {
            if (map1.containsKey(str1.charAt(i))) {
                map1.put(str1.charAt(i), map1.get(str1.charAt(i)) + 1);
            } else
            {
                map1.put(str1.charAt(i), 1);
            }
        }

        for(int i=0;i<n2;i++) {
            if (map2.containsKey(str2.charAt(i))) {
                map2.put(str2.charAt(i), map2.get(str2.charAt(i)) + 1);
            } else
            {
                map2.put(str2.charAt(i), 1);
            }
        }
        return  map1.equals(map2);
    }
}

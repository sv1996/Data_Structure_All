package  Arrays;
import java.util.*;

public class TestArray {
    public static char firstUniqChar(String s)
    {
      int count [] = new int [26];
      for (char c :s.toCharArray())
        {
            int pos = c-'a';
           count[pos]++;
        }

        int i=0;
        for (char c :s.toCharArray()) {
           if(count[c-'a']==1){
               return c;

           }
            i++;
        }
        return 'z';
    }
    public static void main(String[] args) {

        String s = "aabcc";
        char ans =  firstUniqChar(s);
        System.out.println(ans);

//        int[] count = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
////            count[ch-'a']++;
////            System.out.println("After count "+ count[ch-'a']++
//            int pos = ch-'a';
//         int a=   count[pos++];
//
//            System.out.println(a);
//
//        }

    }


}

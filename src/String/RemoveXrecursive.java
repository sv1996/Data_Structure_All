package  String;

public class RemoveXrecursive {
    public static void main(String[] args) {
        String str = "abxcxqwrds";
        String ans = removeX(str);
        System.out.println(ans);
    }

    private static String removeX(String str) {
        if(str.length()==0){
            return str;
        }
        String ans ="";
        if(str.charAt(0)!='x'){
           ans= ans+ str.charAt(0);
        }
        return ans + removeX(str.substring(1));
    }

}

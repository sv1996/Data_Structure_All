package String;

public class StringPractise {


    public static void main(String[] args) {
        String s1=new String("hello");
        String s2=new String("hello");
        String s3="hello";
        String s4="hello";
        String s5="Hello";
      //  What is the output for below code,
        System.out.println(s1==s2); // false because both are different objects in heap memory
        System.out.println(s1.equals(s2)); // content comparison will return true because both have same content

        System.out.println(s1==s3);//  false because s1 is in heap memory and s3 is in string constant pool
        System.out.println(s3==s4); // true both are in string constant pool
        System.out.println(s3.equals(s4)); // content comparison
        System.out.println(s1==s5);//` false because of case sensitivity
        System.out.println(s3.equalsIgnoreCase(s5)); // true because case is ignored
    }
}

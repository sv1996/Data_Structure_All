package Class;
class Student {
   int id;
   String name;
   Student (int id , String name )
    {
      this.id =id;
      this.name = name;


    }
}



public class Comparison {
    public static void main(String[] args) {
        Student s1 = new Student( 1, "hg");
        Student s2 = new Student( 2, "hga");
        Student s3 = new Student( 1, "hg");
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}

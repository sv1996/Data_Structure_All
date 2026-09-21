package ArrayList;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

class Student {
    public String name;
    public int rollno;
    public int age;

    public Student(String n, int rno, int ag)
    {
        name =n;
        rollno = rno;
        age =ag;
    }
}
public class ArrayListObjectDemo {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student("Shivam" , 21,54));
        al.add(new Student("Rohan",22 , 56));

        al.forEach((n)-> System.out.println(n.name+" "+ n.rollno+" "+n.age));
       for(Student str : al)
       {
           System.out.println(str.name+" "+str.age+""+str.rollno);
       }


    }
}

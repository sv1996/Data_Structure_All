package ObjectAndHashCode;

public class ObjectHashCodeDemo {


    public static void main(String[] args) {

        Student s1 = new Student(21, "Alice");
        Student s2 = new Student(21, "Alice");
        System.out.println(s1.equals(s2)); // false, different objects because equals() is not overridden
        System.out.println("HashCode of s1: " + s1.hashCode());
        System.out.println("HashCode of s2: " + s2.hashCode());
        // write a code to print 1 to 100 using java

    }
}

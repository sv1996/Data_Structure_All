package Java8MethodReference;

import java.util.Arrays;

class User{
    String name;
    public User(String name)
    {
        this.name = name;
    }

    public void print()
    {
        System.out.println(name);
    }

}
public class MethodReferenceArbitrory {
    public static void main(String[] args) {
        // reference to an instance Method
        // of an Arbitrary Object of a Particular Type
        Arrays.asList(new User("Shivam"), new User("Katrina")).stream().forEach(user->user.print());
        System.out.println("Using Next Methods");
        Arrays.asList(new User("Shivam"), new User("Katrina")).stream()
                .forEach(User::print);
        System.out.println("Using Next Methods Calls");
        Arrays.asList("Java","HTML","SHIVAM").stream()
                .map(s->s.toLowerCase()).forEach(System.out::println);
        System.out.println("Using Next Methods Calls");
        Arrays.asList("Java","HTML","SHIVAM").stream()
                .map(String::toLowerCase).forEach(System.out::println);
    }
}

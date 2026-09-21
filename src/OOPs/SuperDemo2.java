package OOPs;
class Parent1
{
    Parent1()
    {
        System.out.println("Parent");
    }

}
class Child1 extends Parent1{
Child1()
{
    super();
    System.out.println("Child");
}
}
public class SuperDemo2 {
    public static void main(String[] args) {
    Child1 c = new Child1();
    }
}

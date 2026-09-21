package OOPs;
class  Parent3
{
 String name ="Shivam";
public void Parent3Method()
 {
     System.out.println("Shivam Is Showing");

 }

}

class Child3 extends Parent3
{
String ChildName = "Hello Child";
public void Child3Method()
{
    System.out.println("Child3 is Showing");
}

}
public class SuperDemo3 {
    public static void main(String[] args) {
        //Parent3 c = new Parent3();
        Child3 c = new Child3();
    // Parent3 c = new Child3();
    //Child3 c = new Parent3();

      System.out.println(c.ChildName);
       c.Child3Method();
       System.out.println(c.name);
       c.Parent3Method();


    }
}

package OOPs;
class Parent {
    String parentName ="parent";

}

class Child extends Parent
{
    String childName ="child";

      void printColor()
      {
          System.out.println(childName);
          System.out.print(super.parentName);

      }
}
public class SuperDemo1 {
    public static void main(String[] args) {
        Child c = new Child();

        c.printColor();


    }
}

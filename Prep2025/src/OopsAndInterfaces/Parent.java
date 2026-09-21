package OopsAndInterfaces;


class ParentMain
{
    public void m1()
    {
        System.out.print("Parent mm1");
    }
}

class Child extends ParentMain
{
    public void m2()
    {
        System.out.print("Child mm1");
    }
}

public class Parent {

    public static void main(String[] args) {

        ParentMain parent = new ParentMain();
        parent.m1();
       // parent.m2(); // This line will cause a compile-time error
        Child child =  new Child();
        child.m1();
        child.m2();
        ParentMain parentMain = new Child();
        parentMain.m1();
    //    parentMain.m2(); // This line will also cause a compile-time error
     //   Child child1 = new ParentMain(); // This line will cause a compile-time error
    }
}

package OOPs;
class Parent4{
    void show()
    {
        System.out.println("Parent Is Showing");
    }

}

class Child4 extends Parent4{

    void show()
    {
        System.out.println("Child is Not shpwing");
    }


}
public class OverRidingDemo {
    public static void main(String[] args) {
        Child4 c = new Child4();
        c.show();

    }
}

package Class;
class Outer {


    class Inner {

        public void m1() {
            System.out.println("Shivam");
        }


    }
}

public class Testable {
    public static void main(String[] args) {
        Outer o = new Outer();

        Outer.Inner i = o.new Inner();
        i.m1();

    }
}

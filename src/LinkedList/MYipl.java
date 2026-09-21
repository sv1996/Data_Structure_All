package LinkedList;
class Complex {
    public static void f1()
    {
        System.out.println(
                "f1 method of the Complex class is executed.");
    }

    public void f2() {
        System.out.println(
                "f2 method of the Complex class is executed.");
    }
}
class Sample extends Complex {
    public static void f1()  {
        System.out.println(
                "f1 of the Sample class is executed.");
    }
    public void f2() {
        System.out.println(
                "f2 method of the Sample class is executed.");
    }
}
public class MYipl {
    public static void main(String[] args) {
        //
                Complex d1 = new Complex();// parent p = new Parent();
                Complex d2 = new Sample(); //   Parent p =new child()
                d1.f1();  ///  f1 method of the Complex class is executed
                d2.f1(); /// "f1 of the Sample class is executed
                d1.f2();  //	  f2 method of the Complex class is executed.
                d2.f2();  //  "f2 method of the Sample class is executed

        Thread th = new Thread();
            }
}



//    Complex d1 = new Complex();// parent p = new Parent();
//    Complex d2 = new Sample();    Parent p =new child()
//
//                d1.f1();  ///  f1 method of the Complex class is executed
//                        d2.f1(); /// "f1 of the Sample class is executed
//
//                        d1.f2();	  f2 method of the Complex class is executed.
//        d2.f2(); "f2 method of the Sample class is executed
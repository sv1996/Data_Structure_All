package  Inheritence;

import java.sql.SQLOutput;

abstract class Parent  {
  String pName = "parent";
}
public class Child extends Parent {
   String cName ="child";
   public static void main(String[] args) {
     //   Child c = new Child ();
     ///   System.out.println(c.pName);
      //  System.out.println(c.cName);
      //  Parent p = new Parent();
     //  System.out.println(p.pName);
   //    System.out.println(p.cName);
        /*
        Child c = new Parent ();
        */
        Parent p = new Child();

        System.out.println(p.pName);
    //    System.out.println(p.cName);

    }
}

package InterfaceAndAbstraction;
interface I {
  //  public abstract void add ();
    // default Keyword  Should be Added In Version 8
    static int add(int a, int b)
    {
        int c = a+b;
        return c;
    }

   default void show ()
    {
        System.out.println("I interface");
    }
}
interface J{
    //  public abstract void add ();
    // default Keyword  Should be Added In Version 8
    default void show ()
    {
        System.out.println("J interface");
    }
}



 public class InterfaceInV8 implements I,J {
       public void show()
        {
            I.super.show();
            J.super.show();
        }

        public static void main(String[] args) {
        InterfaceInV8 i = new  InterfaceInV8();
        i.show();
       int ans = I.add(2,3);
       System.out.println(ans);

    }

}

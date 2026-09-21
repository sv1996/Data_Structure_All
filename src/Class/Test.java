package Class;
class One{
   public One()
    {
        System.out.println("This is superclass Constructor");
    }
}

class Two extends One{
  //
    public Two()
    {
        super();
        System.out.println("This is base class Constructor");
    }
}
public class Test {
    public static void main(String[] args) {
    Two t = new Two ();


    }
}

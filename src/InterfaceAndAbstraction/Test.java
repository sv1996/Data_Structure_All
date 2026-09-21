package  InterfaceAndAbstraction;
class Shivam
 {
    String name;
    int age;

}
   interface printable
       {
    void print();
       }
  public class Test implements printable {
      public void print(){
          System.out.println("hello");
      }

    public static void main(String[] args) {
        Test t = new Test();
        t.print();
    }
}


package Class;


public class CloneImplements implements Cloneable {
    int i=10;
    int j =20;
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneImplements t1 = new CloneImplements();

        CloneImplements t2 =  (CloneImplements)t1.clone();

     //   t2.i=100;
      //  t2.j=200;
        System.out.println(t1.i +" " + t1.j);
        System.out.println(t2.i +" " + t2.j);
        System.out.println(t1.hashCode() == t2.hashCode());
        System.out.println(t1==t2);


    }
}

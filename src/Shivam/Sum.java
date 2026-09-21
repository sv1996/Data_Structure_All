package  Shivam;
class Value
{

    static int f =10;
    int a,b;

    public void setValue(int x , int y)
    {
        a=x;
        b=y;
    }

    public void printValue()
    {
        System.out.println(a+" "+b);
    }



}
public class Sum {


    public static void main(String[] args) {


        Value v = new Value();
        v.setValue(1,2);
        v.printValue();
        System.out.println(v.f);

    }



}

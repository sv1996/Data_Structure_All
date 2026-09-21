package  Shivam;
class Test
{

    int x , y;
    Test()
    {
        x=10;
        y=20;
    }


}
public class ObjectCloning
 {

 public static void main(String[]args)
 {
     Test obj1= new Test();
     System.out.println(obj1.x +" " + obj1.y);

     Test obj2 = obj1;

     obj2.x =100;
     obj2.y =80;


     System.out.println(obj1.x +" " + obj1.y);
     System.out.println(obj2.x +" " + obj2.y);

 }


         }





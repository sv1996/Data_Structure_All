package ArrayList;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

class Employee {
//    int id;
//    String name;
    private String id;

//    public Employee(int id, String name) {
//        this.id = id;
//        this.name =name;
//    }

    public Employee (String id){
        this.id =id;
    }


    @Override
     public int hashCode(){
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        return true;
    }
}

public class Al {
    public static void main(String[] args)  throws  Exception{
        try{

        } catch (Exception pce){
            pce.printStackTrace();;
        }
//Integer num1 =10;
//Integer num2 =20;
//        System.out.println("Before Swapping");
//        System.out.println("Value of num1 is " + num1);
//        System.out.println("Value of Num2 is " + num2);
//        swap(num1, num2);
//        System.out.println("After Swapping");
//        System.out.println("Value of num1 is " + num1);
//        System.out.println("Vlaue of num2 is " + num2);

//        Employee e1 = new Employee(1,"A");
//        Employee e2 = new Employee(1,"A");
//        System.out.println(e1);
//        System.out.println(e2);
//        Set<Employee> treeSet = new TreeSet<Employee>();
//        treeSet.add(e1);
//        treeSet.add(e2);
//        System.out.println(treeSet);
//        HashMap<Employee , String > hashMap = new HashMap<Employee, String>();
//        hashMap.put(new Employee("a"), "emp1");
//        hashMap.put(new Employee("b"), "emp1");
//        hashMap.put(new Employee("a"), "emp1 OVERRIDDEN");
//        System.out.println(hashMap.size());
//        System.out.println(hashMap.get(new Employee("a")));
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        Iterator<Integer> itr = list.iterator();
//        while(itr.hasNext()){
//            Integer i = itr.next();
//            itr.remove();
//            System.out.println(list.size());
//        }

//        try{
//            int [] a = new int [5];
//            a[5] =1;
//            System.out.println("Value is " + a[5]);
//        } catch (Exception e){
//            System.out.println("Exception caught");
//        }
//        catch(ArrayIndexOutOfBoundsException){
//            System.out.println("ArrayIndex Exception caught");
//        }

//try{
//    return;
//} catch(Exception e){
//    return;
//} finally {
//    System.out.println("Finally executed");
//}

//        String s = "Test";
//        String s2 = new String("Test").intern();
//        String s3 = new String("Test");
//        System.out.println(s==s2);
//        System.out.println(s==s3);
//        System.out.println(s2==s3);
//        System.out.println(s==s2);
//        System.out.println(s==s3);
//        System.out.println(s3==s2);
//        System.out.println(s2!=s3);
//        System.out.println(s==s2);
//       boolean a = true;
//        boolean b = true;
//        boolean c = true;
//        System.out.println( a && (b||c) == (a && b) || (a && c));
//        System.out.println( a ||  (b&&c) == (a || b) || (a || c));
//        System.out.println((a && b) || c == c || (b && a));
//        Employee e1 = new Employee("1");
//       Employee e2 = new Employee("2");
//       Map <String, Employee> map1 = new HashMap<String, Employee>();
//       map1.put("i",e1);
//        map1.put("2",e2);
//        Map<Employee ,String> map2 = new HashMap<Employee, String>();
//        map2.put(e1,"1");
//        map2.put(e2,"2");
//        System.out.println(map1.size());
//        System.out.println(map2.size());
    }

    private static void swap(Integer num1, Integer num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}

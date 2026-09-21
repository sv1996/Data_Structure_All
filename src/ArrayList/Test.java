package ArrayList;

 class ABC{
    protected static String value ="";
    public ABC(){
        value ="ABC";
    }

}

 class EFG extends ABC {
    static {
        value ="EFG";
    }
    public EFG(){

    }

    public void printValue(){
        System.out.println(value);
    }

}



public class Test {
    public static void main(String[] args) {
         try{
             EFG efg = new EFG();
             efg.printValue();
         } catch (Exception pce){
             pce.printStackTrace();
         }
    }
}

package InterfaceAndAbstraction;
interface Print {
    public abstract void animalSound();
    public  abstract void sleep();
    int a =10;

}

public   class InterPractice implements Print {
    public void sleep()
    {
        System.out.println("Sleep");
    }

    public void animalSound()
    {
        System.out.println("animal Sound");
    }


    public static void main(String[] args) {
        System.out.println(a);
        InterPractice a = new InterPractice();
        a.sleep();
        a.animalSound();
        System.out.println(Print.a);

    }






}

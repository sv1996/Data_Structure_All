package DesignPatterns.SingletonDesignPattern;

class SingletonObject {
    // create a private static instance of the class
    private static SingletonObject instance = new SingletonObject();

    // make the constructor private so that no other class can instantiate it
    private SingletonObject() {
        System.out.println("Singleton Object is created");
    }

    // get the only object available
    public static SingletonObject getInstance() {
        return instance;
    }

    // other methods of the class
    public void showMessage() {
        System.out.println("Hello from Singleton Object");

    }

}

public class SingletonDesignPatternDemo {

    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.showMessage();
    }
}

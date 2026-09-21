package FunctionalInterface;




public class FunctionalInterfaceDemo {


    public static void main(String[] args) {
        Running running = (runningStyle) -> System.out.println("This is the running style: " + runningStyle);
        getRunningStyle(running);
    }

    private static void getRunningStyle(Running running) {
        running.run("Sprinting");
    }
}

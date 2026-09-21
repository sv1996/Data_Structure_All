package FunctionalInterface;

public class RunningClass  implements Running {

    @Override
    public void run(String runningStyle) {
        System.out.println("This is the running style: " + runningStyle);
    }
}

package Java8AlImplementation;

public class Practice {
    public static void main(String[] args) {
        int a = 10;
       changeNumber(a);
        System.out.println(a);
    }

    private static int changeNumber(int abc) {
        abc= abc+12;
        return abc;
    }
}

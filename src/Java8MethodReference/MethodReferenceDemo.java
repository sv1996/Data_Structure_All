package Java8MethodReference;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        Calculator calculator = Scientific::sum;
        calculator.calculate(10,20);
        Scientific scientific = new Scientific();
        Calculator calculator1 =scientific::findProduct;
        calculator1.calculate(10,20);

    }
}

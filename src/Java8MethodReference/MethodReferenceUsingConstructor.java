package Java8MethodReference;

interface  ShapeFactory
{
    Shape getShape(int x);
}
 class Shape{
    int x ;
    public Shape(int x)
    {
        super();
        this.x = x;
    }
    void area()
    {
        System.out.println("Area is " + x*x);
    }
 }


public class MethodReferenceUsingConstructor {
    public static void main(String[] args) {
     // Reference to A constructor
        ShapeFactory factory = Shape::new;
        Shape shape =factory.getShape(10);
        shape.area();
    }
}

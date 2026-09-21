package DesignPatterns.FactoryDesignPattern;

public class FactoryDesignPatternDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        // get Circle shape
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        // get Rectangle shape
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        // get Square shape
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

    }
}

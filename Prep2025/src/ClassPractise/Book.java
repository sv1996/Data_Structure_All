package ClassPractise;


import groovy.transform.ToString;

@ToString
public class Book {
    private String name;
    private int price;

    public Book() {
        // default constructor
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }


    // getters and setters

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;

    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // make Object
    public static void main(String[] args) {
        Book book = new Book("Java Programming", 500);
        System.out.println(book);
        book.setName("Python Programming");
        book.setPrice(600);
        System.out.println(book);
    }


}

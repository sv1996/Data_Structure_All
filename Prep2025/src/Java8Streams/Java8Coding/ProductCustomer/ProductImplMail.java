package Java8Streams.Java8Coding.ProductCustomer;

import java.util.Comparator;
import java.util.List;


public class ProductImplMail {
    public static void main(String[] args) {
        List<Product> productsList = List.of(new Product(101, "RDsHARMA", "Books"),
                new Product(102, "Maths", "Books"),
                new Product(103, "Science", "Books"),
                new Product(104, "Nagraj", "Comics"),
                new Product(105, "Shibu", "Comics"));
        System.out.println("Product List: ");
        productsList.forEach(System.out::println);
        // Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100
        List<Product> filteredProduct = productsList.stream().filter(e->e.getCategory().equals("Books"))
                .filter(e->e.getId()>100).toList();
        System.out.println("Filtered Product List: ");
        filteredProduct.forEach(System.out::println);
        //  Exercise 3 — Obtain a list of product with category = “Books” and then apply 10% discount on id
        List<Product> fileteredList = productsList.stream().filter(e->e.getCategory().equals("Books")).map(e->new Product(e.getId()*6,
                e.getName(), e.getCategory()) ).toList();
        System.out.println("Discounted Product List: ");
        fileteredList.forEach(System.out::println);
        // Exercise 5 — Get the cheapest products of “Books” category
        System.out.println("Cheapest Product in Books Category: ");
        productsList.stream().filter(e -> e.getCategory().equals("Books")).min(Comparator.comparing(Product::getId)).ifPresent(System.out::println);
        // Exercise 14 — Obtain a data map with list of product name by category

//        Collectors.groupingBy(Product::getCategory),
//                then the output will be Map<Category, List of Products> but the expected
//        output should be Map<Category, List of Product Name>. You can use Collectors.mapping()
//        to convert product objects to product names for the data map construction.

        System.out.println("Data Map with list of product name by category: ");
        var dataMap = productsList.stream().collect(java.util.stream.Collectors.groupingBy(Product::getCategory,
                java.util.stream.Collectors.mapping(Product::getName, java.util.stream.Collectors.toList())));
        dataMap.forEach((category, names) -> {
            System.out.println("Category: " + category);
            names.forEach(name -> System.out.println("  Product Name: " + name));
        });

    }



}

package Java8Streams.Java8Coding.ProductCustomer;

public class Product {
    public Integer  getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product(Integer id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    private Integer id;
    private String name;
    private String category;

}

package Java8Streams.Java8Coding.ProductCustomer;

public class Employee {

    public String name;
    public int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", JobTitle='" + JobTitle + '\'' +
                '}';
    }

    public String JobTitle;

    public String getJobTitle() {
        return JobTitle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Employee(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        JobTitle = jobTitle;
    }
}

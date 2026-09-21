package Java8Streams.Java8Coding.ProductCustomer;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMainImpl {

    public static void main(String[] args) {
        // creating List of Employee objects
        List<Employee> employees = List.of(new Employee("Alice", 28, "Engineer"), new Employee("Bob", 35, "Manager"), new Employee("Charlie", 25, "Analyst"), new Employee("Diana", 32, "Designer"));
        System.out.println(employees);
        // now performing some operations using streams
        // 1. Filter employees older than 30
        System.out.println("Employees older than 30:");
        employees.stream().filter(e -> e.getAge() >= 30).forEach(System.out::println);
        // 2. Get names of all employees
        System.out.println("Names of all employees:");
        employees.stream().map(Employee::getName).forEach(System.out::println);
        // 3. Count number of employees
        long count = employees.stream().count();
        System.out.println("Total number of employees: " + count);
        // 4. Find first employee
        System.out.println("First employee in the list:");
        employees.stream().findFirst().ifPresent(System.out::println);
        // 5. Calculate average age of employees
        System.out.println("Average age of employees:");
        employees.stream().mapToInt(Employee::getAge).average().ifPresent(System.out::println);
        // 6. List all job titles
        System.out.println("Job titles of all employees:");
        employees.stream().map(Employee::getJobTitle).forEach(System.out::println);
        // 7. Find duplicate names
        System.out.println("Duplicate employee names:");
        java.util.HashSet<String> nameSet = new java.util.HashSet<>();
        employees.stream().map(Employee::getName).filter(name -> !nameSet.add(name)).forEach(System.out::println);
        // 8. Sum of ages of all employees
        System.out.println("Sum of ages of all employees:");
        int totalAge = employees.stream().mapToInt(Employee::getAge).sum();
        System.out.println(totalAge);
        // 9. Employees with name starting with 'A'
        System.out.println("Employees with names starting with 'A':");
        employees.stream().filter(e -> e.getName().startsWith("A")).forEach(System.out::println);


        // groupBy JobId or JobTitle
        System.out.println("Grouping employees by job title:");
        Map<Integer, List<Employee>> groupByAge = employees.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(groupByAge);
        // sort the employees by age
        System.out.println("Employees sorted by age:");
        employees.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
        System.out.println("Employees sorted by age in reversed Order:");
        employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).forEach(System.out::println);
        // Sort and collect into a List (very common)
        System.out.println("Employees sorted by age and collected into a List:");
        List<Employee> empl = employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).toList();
        System.out.println(empl);
        // 5️⃣ Sort by age, then by name (INTERVIEW GOLD ⭐)
        System.out.println("Employees sorted by age, then by name:");
        employees.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName)).forEach(System.out::println);
        // sorting by lambda way
        System.out.println("Employees sorted by age using lambda:");
        employees.stream().sorted((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge())).forEach(System.out::println);
    }


}

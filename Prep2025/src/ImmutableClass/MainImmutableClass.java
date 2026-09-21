package ImmutableClass;


import java.util.ArrayList;
import java.util.List;

final class ImmutableClass {
//  make all fields private and final
    private final String name;
    private final Integer studentId;
    private final List<String> subjects;

    // getters
    public String getName() {
        return name;
    }


    public Integer getStudentId() {
        return studentId;
    }

    public List<String> getSubjects() {
        return new ArrayList<>(subjects);
    }

    // deep copy in constructor
    ImmutableClass(String name, Integer studentId, List<String> subjects) {
        this.name = name;
        this.studentId = studentId;

        // defensive copy since we are creating new ArraysList from the passed subjects list
        // or we can use unmodifiedList from Collections class
        this.subjects = new ArrayList<>(subjects);
    }

}

public class MainImmutableClass {
    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("Science");

        ImmutableClass student1 = new ImmutableClass("John", 101, subjects);

        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Student Subjects: " + student1.getSubjects());


        // Trying to modify the subjects list
        subjects.add("History");
        System.out.println("After modifying original subjects list:");
        System.out.println("Student Subjects: " + student1.getSubjects());
    }


}

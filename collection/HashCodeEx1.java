package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student student1 = new Student("asdf", "asdfff", 5);
        Student student2 = new Student("f", "asf", 3);
        Student student3 = new Student("df", "fff", 4);
        map.put(student1, 12.0);
        map.put(student2, 5.0);
        map.put(student3, 7.7);
        System.out.println(map);

        Student student4 = new Student("asdf", "asdfff", 5);
        boolean result = map.containsKey(student4);
        System.out.println(result);
    }

}

class Student {
    private String name;
    private String surname;
    private int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}

package lambda;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo {
    void testStudents(ArrayList<Student> arrayList, StudentChecks studentChecks) {
        for (Student s : arrayList) {
            if (studentChecks.check(s)) {
                System.out.println(s);
            }
        }
    }

    ;

//    void printStudentsOverGrade(ArrayList<Student> arrayList, double grade) {
//        for (Student s : arrayList) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> arrayList, int age) {
//        for (Student s : arrayList) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> arrayList, int age, double grade, char sex) {
//        for (Student s : arrayList) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}


interface StudentChecks {
    boolean check(Student s);
}

class Test {
    public static void main(String[] args) {

        Student student1 = new Student("Ivan", 'm', 22, 3, 8.2);
        Student student2 = new Student("Iv", 'm', 25, 5, 6.5);
        Student student3 = new Student("Ana", 'f', 21, 2, 5.8);
        Student student4 = new Student("Vapi", 'f', 20, 1, 6.3);
        Student student5 = new Student("Roma", 'm', 223, 4, 7.2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.testStudents(students, new CheckOverGrade());

        studentInfo.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age < 23;
            }
        });

        studentInfo.testStudents(students, (Student s) -> {
            return s.age < 23;
        });
        studentInfo.testStudents(students, s -> s.age < 23);

        studentInfo.testStudents(students, (s -> {
            return s.avgGrade > 24;
        }));
        studentInfo.testStudents(students, s -> {
            return s.age < 23 && s.avgGrade > 5 && s.sex == 'f';
        });

//        studentInfo.printStudentsOverGrade(students, 6);
//        studentInfo.printStudentsUnderAge(students, 24);
//        studentInfo.printStudentsMixCondition(students, 23, 5, 'f');
    }
}

class CheckOverGrade implements StudentChecks {

    @Override
    public boolean check(Student s) {
        return s.avgGrade > 5;
    }
}


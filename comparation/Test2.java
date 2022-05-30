package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee(700, "ASd", "qwe", 122);
        Employee employee2 = new Employee(254, "Ivan", "Sid", 785);
        Employee employee3 = new Employee(34, "Hun", "Red", 95);

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println(list);
        Collections.sort(list, new SalaryComparator());
        System.out.println(list);

    }
}


class Employee implements Comparable<Employee> {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else return 1;
    }
}
//        return this.id - anotherEmp.id;
//        return this.id.compareTo(anotherEmp.id);
//        int res = this.name.compareTo(anotherEmp.name);
//        if (res == 0) {
//            res = this.surname.compareTo(anotherEmp.surname);
//        }
//        return res;

//}

//class IdComparator implements Comparator<Employee> {
//
//    @Override
//    public int compare(Employee employee1, Employee employee2) {
//        if (employee1.id == employee2.id) {
//            return 0;
//        } else if (employee1.id < employee2.id) {
//            return -1;
//        } else return 1;
//    }
//}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.name.compareTo(employee2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.salary - employee2.salary;
    }
}


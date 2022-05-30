package generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ina", 13);
        Schoolar schoolar2 = new Schoolar("VIna", 12);
        Schoolar schoolar3 = new Schoolar("VI", 11);
        Schoolar schoolar4 = new Schoolar("In", 14);

        Student student1 = new Student("Werf", 25);
        Student student2 = new Student("Por", 22);

        Employee employee1 = new Employee("Das", 34);
        Employee employee2 = new Employee("Ton", 42);

        Team<Schoolar> schoolarTeam1 = new Team("Dragons");
        schoolarTeam1.addNewParticipant(schoolar1);
        schoolarTeam1.addNewParticipant(schoolar2);

        Team<Student> studentTeam1 = new Team("Hunt");
        studentTeam1.addNewParticipant(student1);
        studentTeam1.addNewParticipant(student2);

        Team<Employee> employeeTeam1 = new Team("Job");
        employeeTeam1.addNewParticipant(employee1);
        employeeTeam1.addNewParticipant(employee2);

        Team<Schoolar> schoolarTeam2 = new Team("Agons");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam1.playWith(schoolarTeam2);
    }
}

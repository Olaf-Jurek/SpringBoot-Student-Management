package students;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan", "Kowalski", StudentCondition.ODRABIAJACY, 1995, 75.5));
        students.add(new Student("Adrian", "Puchacki", StudentCondition.NIEOBECNY, 1998, 0));
        students.add(new Student("Robert", "Lewandowski", StudentCondition.CHORY, 1998, 0));
        StudentsClass newStudentsClass = new StudentsClass("A",30);
        newStudentsClass.addStudent(students.get(0));
        newStudentsClass.addStudent(students.get(1));
        newStudentsClass.addStudent(students.get(2));

//        for (Student student : students) {
//            student.print();
//        }
        newStudentsClass.addPoints(newStudentsClass.students.get(0),20);
        newStudentsClass.summary();
    }
}
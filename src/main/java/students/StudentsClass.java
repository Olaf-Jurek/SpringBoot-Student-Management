package students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class StudentsClass {
    private String groupName;
    List<Student> students;
    private int maxStudents;
    private int studentCount = 0;

    public StudentsClass(String groupName, int maxStudents) {
        this.groupName = groupName;
        this.maxStudents = maxStudents;
        students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        if (maxStudents >= 20){
            students.add(student);
            studentCount++;
        }
        else System.out.println("Max students limit reached");
    }
    public void addPoints(Student student, double points) {
        student.points += points;
    }

    public void removePoints(Student student, double points) {
        student.points -= points;
    }

    public void getStudent(Student student) {
        if (student.points <= 0) {
            students.remove(student);
        }
    }

    public void changeCondition(Student student, StudentCondition condition) {
        student.studentCondition = condition;
    }

    public Student search(String lastName) {
        for (Student student : students) {
            if (student.getLastName().equals(lastName)) {
                System.out.println(student.lastname + " was found");
                return student;
            }
        }
        return null;
    }

    public List<Student> searchPartial(String partial) { //
        List<Student> foundStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getLastName().contains(partial)) foundStudents.add(student);
        }
        return foundStudents;
    }

    public int countByCondition(StudentCondition condition) {
        int count = 0;
        for (Student student : students)
            if (student.studentCondition == condition) {
                student.print();
                count++;
            }
        return count;
    }
    public void summary() {
        for (Student student : students) {
            student.print();
        }
    }

    public List<Student> sortByName() {
        List<Student> sortedStudents = new ArrayList<>();
        Collections.sort(sortedStudents, Comparator.comparing(Student::getLastName)); //could be replaced with List.sort
        return sortedStudents;
    }
    public List<Student> sortByPoints(){
        List<Student> sortedStudents = new ArrayList<>();
        Collections.sort(sortedStudents, Comparator.comparingDouble(Student::getPoints).reversed());
        return sortedStudents;
    }
//    public List<Student> max(){
//        return (Collections.max(students, Comparator.comparing(Student::getLastName)));
//    }
    public String getGroupName(){
        return groupName;
    }
    public int getMaxStudents(){
        return maxStudents;
    }
    public int getStudentCount(){
        return studentCount;
    }
    public double getPercentage(){
        return studentCount/maxStudents*100;
    }
}

package students;

public class Student implements Comparable<Student> {
    //private final com.company.StudentCondition StudentCondition;// {
    String name;
    String lastname;
    StudentCondition studentCondition;
    int dateOfBirth;
    double points;

    public Student(String name, String lastname, StudentCondition studentCondition, int dateOfBirth, double points) {
        this.name = name;
        this.lastname = lastname;
        this.studentCondition = studentCondition;
        this.dateOfBirth = dateOfBirth;
        this.points = points;
    }

    //    @Override
//    public int compareTo(Student other) {
//        return 0;
//    }
    @Override
    public boolean compareTo(Student other) {
        if (lastname == other.lastname) return true;
        else return false;
    }

    public String getLastName() {
        return lastname;
    }

    public double getPoints() {
        return points;
    }

    public StudentCondition getCondition() {
        return studentCondition;
    }

    void print() {
        System.out.println(name + lastname + studentCondition + dateOfBirth + " " + points);
    }
}

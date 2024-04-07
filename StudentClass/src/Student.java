//พิทวัส ฤทธิ์เดช 6508185

public class Student {
    private final int id;
    private final String name;
    private final double grade;

    public Student(int sid, String sname, double sgrade) {
        id = sid;
        name = sname;
        grade = sgrade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}

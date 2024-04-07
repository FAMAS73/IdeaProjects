//พิทวัส ฤทธิ์เดช 6508185

import java.util.ArrayList;

public class StudentQuizApp {
    public static void main(String[] args) {
        //set add remove size
        ArrayList<Student> StudentList = new ArrayList<Student>();
        Student p_print;
        Student student1 = new Student(66001111, "Somchai", 3.25);
        Student student2 = new Student(66002222, "Supab", 2.01);
        Student student3 = new Student(66003333, "Jakree", 3.65);
        StudentList.add(student1);
        StudentList.add(student2);
        StudentList.add(student3);
        p_print = StudentList.get(0);
        showStudentList(student1);
        p_print = StudentList.get(1);
        showStudentList(p_print);

        StudentList.set(1, student2);
        p_print = StudentList.get(0);
        showStudentList(student2);
        p_print = StudentList.get(1);
        showStudentList(p_print);


    }

    public static void showStudentList(Student Astudent) {
        int id;
        String sn;
        double sg;
        id = Astudent.getId();
        sn = Astudent.getName();
        sg = Astudent.getGrade();

        System.out.println(id + " " + sn + " " + sg);
    }
}
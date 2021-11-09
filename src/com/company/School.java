package com.company;
import java.util.List;

public class School {
    private String name;
    private List<Teacher> teachers;
    private List<Student> students;
    private double moneyEarned;
    private double moneySpent;

    public School() {}

    public School(String name, List<Teacher> teachers, List<Student> students) {
        this.name = name;
        this.teachers = teachers;
        this.students = students;
        moneyEarned = 0;
        moneySpent = 0;
    }

    // get a list of teachers
    public List<Teacher> getTeachers() {
        return teachers;
    }
    // add 1 more teacher
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    // get a list of students
    public List<Student> getStudents() {
        return students;
    }
    // add 1 more student
    public void addStudents(Student student) {
        students.add(student);
    }

    // get money earned
    public double getMoneyEarned() {
        return moneyEarned;
    }
    // add more money
    public void updateMoneyEarned(double amount) {
        moneyEarned += amount;
    }

    // get money spent
    public double getMoneySpent() {
        return moneySpent;
    }
    // subtract money
    public void updateMoneySpent(double amount) {
        moneySpent -= amount;
    }

    public String showInfo() {
        return (String.format("%s School has %s teachers and %s students," +
                "\n has earned %.2f and spent %.2f thus far.", name, teachers.size(), students.size(), moneyEarned, moneySpent));
    }
}

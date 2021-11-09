package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Student student = new Student("John", 86.03);
        Student student2 = new Student("Ben", 84.10);
        Student student3 = new Student("Jen", 19.1);

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);

        Teacher teacher = new Teacher("Bone", 30000.00);
        Teacher teacher2 = new Teacher("JJ", 10000.00);
        Teacher teacher3 = new Teacher("Tan", 30500.00);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher);
        teachers.add(teacher2);
        teachers.add(teacher3);

        School school = new School("Super",teachers, students);

        System.out.println(school.showInfo());
        //System.out.println(student);
    }
}

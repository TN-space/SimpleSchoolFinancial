package com.company;

public class Teacher {
    private String id;
    private String name;
    private double salary;

    public Teacher() {}

    public Teacher(String name, double salary) {
        this.id = randomID();
        this.name = name;
        this.salary = salary;
    }

    private String randomID() {
        String idSet = "0123456789";
        char[] idTemp = new char[5];
        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * idSet.length());
            idTemp[i] = idSet.charAt(random);
        }
        return new String(idTemp);
    }

    // Getters for id, name, and salary
    public String getID() {return id;}
    public String getName() {return name;}
    public double getSalary() {return salary;}

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

package com.company;

public class Student {
    private String id;
    private String name;
    private double grade;
    private double paidFee;
    private double totalFee;

    public Student() {}

    public Student(String name, double grade) {
        this.id = randomID();
        this.name = name;
        this.grade = grade;
        paidFee = 0;
        totalFee = 30000;
    }

    private String randomID() {
        String idSet = "0123456789";
        char[] idTemp = new char[7];
        for (int i = 0; i < 7; i++) {
            int random = (int) (Math.random() * idSet.length());
            idTemp[i] = idSet.charAt(random);
        }
        return new String(idTemp);
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void spending(double amount) {
        paidFee += amount;
    }

    // Getters for id, name, grade, paidFee, and totalFee
    public String getId() {return id;}
    public String getName() {return name;}
    public double getGrade() {return grade;}
    public double getPaidFee() {return paidFee;}
    public double getTotalFee() {return totalFee;}

}

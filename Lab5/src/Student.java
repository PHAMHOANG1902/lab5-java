import java.util.*;

class Student {
    private int rollNumber;
    private String name;
    private int age;
    private double mark;

    // Constructor
    public Student(int rollNumber, String name, int age, double mark) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    // Getters and setters
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    // Override toString method for better output representation
    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Age: " + age + ", Mark: " + mark;
    }
}


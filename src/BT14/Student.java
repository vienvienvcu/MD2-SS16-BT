package BT14;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void inputData(Scanner scanner){
        System.out.print("Enter student id: ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter student name: ");
        name = scanner.nextLine();
        System.out.print("Enter student score: ");
        score = Double.parseDouble(scanner.nextLine());
    }

    public void displayData(){
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Score: " + score);
    }
}

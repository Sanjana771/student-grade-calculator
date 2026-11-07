package com.example;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Enter marks between 0 and 100.");
        } 
        else if (marks >= 90) {
            System.out.println(name + " Grade: A");
        } 
        else if (marks >= 80) {
            System.out.println(name + " Grade: B");
        } 
        else if (marks >= 70) {
            System.out.println(name + " Grade: C");
        } 
        else if (marks >= 60) {
            System.out.println(name + " Grade: D");
        } 
        else {
            System.out.println(name + " Grade: Fail");
        }

        sc.close();
    }
}

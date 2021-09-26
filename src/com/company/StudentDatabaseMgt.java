package com.company;

import java.util.Scanner;

public class StudentDatabaseMgt {

    public static void main(String[] args) {


        //ask how many users we should add.
        System.out.println("Enter the number of students to enroll: ");
        Scanner in =new Scanner(System.in);
        int numOfStudents = in.nextInt();
        student[] students = new student[numOfStudents];

        //Create a number of new students
        for (int n= 0; n< numOfStudents; n++){
            students[n] = new student();
            students[n].enroll();
            students[n].payTuition();
        }

        for (int n= 0; n< numOfStudents; n++){
            System.out.println("\n" + "\n"+ students[n].toString());
        }


    }
}

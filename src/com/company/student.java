package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance=0;
    private static int costOfCourse = 600;
    private static int id=1000;

    //constructor- prompt user to enter student's name and year
    public student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - for Sophmore\n3 - Junior\n4-Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();


    }
    //generate an id
    private void setStudentID(){
        //grade level + ID
        id++;
        this.studentId= gradeYear + "" + id;

    }
    //enroll in course
    public void enroll(){
        //introduce a do while loop
        do {
            System.out.print("Enter course to enroll (0 to quit):");
            Scanner in =new Scanner(System.in);
            String course= in.nextLine();
            if (!course.equals("Q")){
                courses= courses + "\n" + course;
                tuitionBalance= tuitionBalance+costOfCourse;
            }
            else {
                break;
            }

        }while (1 !=0);

    }
    //view balances
    public void viewBalance(){
        System.out.println("The total amount is :$" + tuitionBalance);

    }
    //pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment amount: $");
        Scanner in = new Scanner(System.in);
        int payment= in.nextInt();
        tuitionBalance= tuitionBalance- payment;
        System.out.println("Thank you for your payment of  $ " + payment);
        viewBalance();
    }
    //show status
    public String toString(){
        return  "Student Id:" +studentId+
                "\nName:" + firstName + " "+lastName+
                "\nGrade Level:"+ gradeYear+
                "\nCourses Enrolled:"+courses+
                "\nBalance: $"+ tuitionBalance ;
    }

}

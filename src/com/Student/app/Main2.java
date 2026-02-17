package com.Student.app;

public class Main {
    public static void main(String[] args) {
        System.out.println("********************* STUDENT MANAGEMENT SYSTEM ***************************");
        System.out.println("*************************** WELCOME ******************************");


        Student s1;//reference variable
        s1= new Student("Abhinandan Basu", 25, "S-21");
        s1.enrollCourse("Java");
        s1.enrollCourse("Devops");
        s1.enrollCourse("DSA");
        s1.printStudentInfo();

        Student s2 = new Student("Uday", 24, "S-33");
        s2.enrollCourse("DSA");
        s2.printStudentInfo();

        Student s3 = new Student("Shrayshi ", 23, "S-38");
        s3.enrollCourse("Devops");
        s3.printStudentInfo();


    }
}

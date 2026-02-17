package com.Student.app;

import java.util.*;

public class Main {
    private static List<Student> studentList;
    public static void main(String[] args) {
        System.out.println("********************* STUDENT MANAGEMENT SYSTEM ***************************");


        studentList = new ArrayList<Student>();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("*************************** WELCOME ******************************");

            System.out.println("Select an option.....");
            System.out.println("1. Register a student");
            System.out.println("2. Find student information with studentId");
            System.out.println("3. List All Student Information");
            System.out.println("4. List Student information in sorted order");
            System.out.println("5. Exit");

            int options = sc.nextInt();
            switch (options) {
                case 1:
                    enrollStudent(sc);
                    break;
                case 2:
                    searchStudentById(sc);
                    break;
                case 3:
                    printAllStudentData();
                    break;
                case 4:
                    sortByName();
                    break;
                case 5:
                    exit();
                    break;
                default:
                    System.out.println("Invalid Option Selected!...... Enter between 1 to 5");

            }


        }

    }

    private static void exit() {
        System.out.println("*******Good Bye!!!!******");
        System.exit(0);
    }

    private static void printAllStudentData() {
        if(studentList.size()>0) {


            System.out.println("--------------------Printing all Student Data--------------------");
            for (Student student : studentList) {
                student.printStudentInfo();
            }
            System.out.println("-------------------- ********************** --------------------");
        }
        else{
            System.err.println("Student List is Empty!!! No Student record found!!!!");
        }
    }

    private static void enrollStudent(Scanner sc2) {
        System.out.println("Enter Student Name: ");
        String name = sc2.next();
        System.out.println("Enter the Age: ");
        int age = sc2.nextInt();
        System.out.println("Enter the student ID: ");
        String studentId = sc2.next();

        Student newStudent = new Student(name, age, studentId);
        studentList.add(newStudent);
        while(true) {
            System.out.println("Enter the course to be enrolled!!... Type DONE to exit....");
            String courseName = sc2.next();
            if(courseName.equalsIgnoreCase("done")){
                break;
            }

            newStudent.enrollCourse(courseName);
        }
        newStudent.printStudentInfo();
    }

    private static void sortByName() {
        Comparator<Student> studentNameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());

      
        Collections.sort(studentList, studentNameComparator);
        printAllStudentData();

    }

    public static void searchStudentById(Scanner sc2){

        System.out.println("Enter the Student ID:");
        String studentId = sc2.next();

       Student studentFound=null; //explicit initialization
       try {
           studentFound = studentList.stream().filter(student -> student.getStudentId().equalsIgnoreCase(studentId))
                   .findFirst()
                   .orElseThrow(() -> new RuntimeException("No Student Data found !!!"));
       }
       catch(Exception e){
           System.err.println("Student with ID "+studentId+ " not found!!");
       }
       studentFound.printStudentInfo();
    }
}

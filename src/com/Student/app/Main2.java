package com.Student.app;

import java.util.*;

public class Main2 {
    private static List<Student> studentList;
    public static void main(String[] args) {
        System.out.println("********************* STUDENT MANAGEMENT SYSTEM ***************************");
        System.out.println("*************************** WELCOME ******************************");

        studentList = new ArrayList<Student>();


        Student s1;//reference variable
        s1= new Student("Abhinandan Basu", 25, "S-21");
        s1.enrollCourse("Java");
        s1.enrollCourse("Devops");
        s1.enrollCourse("DSA");


        Student s2 = new Student("Uday", 24, "S-33");
        s2.enrollCourse("DSA");


        Student s3 = new Student("Shrayshi ", 23, "S-38");
        s3.enrollCourse("Devops");

        Student s4 = new Student("Akhil", 22, "S-40");
        s4.enrollCourse("Devops");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

       Student result = searchStudentById("S-38");
        System.out.println("Result" + result);
        sortByName();
    }

    private static void sortByName() {
        Comparator<Student> studentNameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());


        Collections.sort(studentList, studentNameComparator);
        System.out.println(studentList);
    }

    public static Student searchStudentById(String studentId){

       Student result=null; //explicit initialization
       try {
           result = studentList.stream().filter(x -> x.getStudentId().equalsIgnoreCase(studentId))
                   .findFirst()
                   .orElseThrow(() -> new RuntimeException("No Student Data found !!!"));
       }
       catch(Exception e){
           System.err.println("Student with ID "+studentId+ " not found!!");
       }
       return result;
    }
}

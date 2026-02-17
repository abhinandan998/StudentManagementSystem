package com.Student.app;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

    //instance variables->attributes
    private String name;
    private int age;
    private String studentId;
    private List<String> courses;

    public Student(String name, int age, String studentId) {
        super();
        if(ValidateAge(age) && ValidateName(name) && validateStudentID(studentId)) {

            this.name = name;
            this.age = age;
            this.studentId = studentId;
            courses = new ArrayList<String>(); //initialization of course
        }
    }
    public void enrollCourse(String course){
        if(validateCourseName(course)) {
            if (!courses.contains(course)) {
                courses.add(course);
                System.out.println("Student is enrolled to " + course + " successfully");

            } else {
                System.err.println("Student is already enrolled into the course " + course);
            }
        }
    }
    public void printStudentInfo(){
        System.out.println("============ STUDENT INFORMATION ============");
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
        System.out.println("Student ID: "+studentId);
        System.out.println("Enrolled for: "+courses);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", courses=" + courses +
                '}';
    }
    //validation methods
    public boolean ValidateAge(int age){
        if(age>= 19 && age<= 35){
            return true;
        }
        else {
            System.err.println("Invalid age!! Student age should be between 19 and 35");
            return false;
        }
    }

    public boolean ValidateName(String name){
        //abhinandan Abhinandan ABHINANDAN ABHiNandan Basu
        String nameRegex = "^[a-zA-Z\\s]+$"; //Regex(regular expression)
        Pattern namePattern = Pattern.compile(nameRegex);
        Matcher nameMatcher = namePattern.matcher(name);
        if(nameMatcher.matches()){
            return true;
        }
        else {
            System.err.println("Invalid Name!! Please enter alphabets only.");
            return false;
        }
    }
    public boolean validateStudentID(String studentId){
        String studentIDRegex = "S-\\d+$"; //S-123
        Pattern studentIDPattern= Pattern.compile(studentIDRegex);
        Matcher studentIDMatcher = studentIDPattern.matcher(studentId);
        if(studentIDMatcher.matches()){
            return true;
        }
        else{
            System.err.println("Invalid Student ID.... Use the format as S-1234");
            return false;
        }
    }
    public boolean validateCourseName(String course)
    {
        if(course.equalsIgnoreCase("Java") || course.equalsIgnoreCase("DSA") || course.equalsIgnoreCase("Devops")){
            return true;
        }else{
            System.err.println("Invalid course Name!!! Please select courses from the list !!! [ Java, DSA, DevOps]");
            return  false;
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    public List<String> getCourses() {
        return courses;
    }
}

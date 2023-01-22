package Practical_11;
//creating student class and making it comparable
import java.util.*;
 class Student implements Comparable<Student>{
//setting variables
    private String studentID;

    public Student(String studentID){
        this.studentID = studentID;
    }

//return methods
    public String getStudentID(){
        return this.studentID;
    }

    public String toString(){
        return "Student{idStudent=" + this.studentID + "}";
    }


     @Override
     public int compareTo(Student o) {
         return 0;
     }
 }

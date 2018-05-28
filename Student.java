/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package JavaApplication2;

//import java.util.ArrayList;
/**
 *
 * @author BEAUTIFUL NEHA
 */
public class Student {
   // public static void main(String args[])
    
    String name;
    String course;
    int fees;
    Student()
    {
        name="Neha";
        course="Android";
        fees=7500;
    }
    Student(String name,String course,int fees)
    {
        this.name=name;
        this.course=course;
        this.fees=fees;
        
    }
 
    void addStudent(String name,String course,int fees)
    {
        this.name=name;
        this.course=course;
        this.fees=fees;
        
    }
   
    void display()
    {
        System.out.println("Name of student=" + name);
        System.out.println("course=" + course);
        System.out.println("fees of the student=" + fees);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author nbui6
 */
public class StudentList {
    public static void main (String[] args){
    Student[] StudentList = new Student[3];
    StudentList[0] = new Student("s1", "nhi");
    StudentList[1] = new Student("s2", "may");
    StudentList [2] = new Student("s2", "julian");
    
    for (int i=0; i<StudentList.length; i++)
    {
        System.out.println(StudentList[i].getStudentName());
    }
    }//end of main
}//end of class

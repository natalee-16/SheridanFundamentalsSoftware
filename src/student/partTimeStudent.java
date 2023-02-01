/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author nbui6
 */
public class partTimeStudent extends Student{

    private int nOfCourse;
    
    public partTimeStudent(String studentId, String studentName) {
        super(studentId, studentName);
    }

    public int getnOfCourse() {
        return nOfCourse;
    }

    public void setnOfCourse(int nOfCourse) {
        this.nOfCourse = nOfCourse;
    }

    public partTimeStudent(int nOfCourse, String studentId, String studentName) {
        super(studentId, studentName);
        this.nOfCourse = nOfCourse;
    }
    
    
    
    
}

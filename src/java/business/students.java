/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class students {
    private int studentID;
    private String studentName;
    private LocalDate birthDate;

    public students() {
    }

    public students(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public students(int studentID, String studentName, LocalDate birthDate) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.birthDate = birthDate;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    
    
}
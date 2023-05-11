/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author prabi
 */
@Entity
public class Student implements Serializable {
    
    @Id
    private Integer studentId;
    private String studentName;
    private String city;
    private Certificate certificate;

    public Student() {
    }

    public Student(Integer studentId, String studentName, String city) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.city = city;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", city=" + city + ", certificate=" + certificate + '}';
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author prabi
 */
@Entity
public class Employee implements Serializable {

    @Id
    private Integer employeeId;
    private String employeeName;

    @ManyToMany
    @JoinTable(
            name = "emp_proj",
            joinColumns = {@JoinColumn(name = "employeeid")},
            inverseJoinColumns = {@JoinColumn(name = "projectid")}
    )
    private List<Project> projects;

    public Employee() {
    }

    public Employee(Integer employeeId, String employeeName, List<Project> projects) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.projects = projects;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", employeeName=" + employeeName + ", projects=" + projects + '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author prabi
 */
@Entity
class Laptop implements Serializable {
    
    @Id
    private Integer laptopId;
    private String laptopName;
    
    @ManyToOne
    private Person person;

    public Laptop() {
    }

    public Laptop(Integer laptopId, String laptopName, Person person) {
        this.laptopId = laptopId;
        this.laptopName = laptopName;
        this.person = person;
    }

    public Integer getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(Integer laptopId) {
        this.laptopId = laptopId;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Laptop{" + "laptopId=" + laptopId + ", laptopName=" + laptopName + ", person=" + person + '}';
    }
    
}

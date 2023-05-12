/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author prabi
 */
@Entity
public class Person implements Serializable {
    
    @Id
    private Integer personId;
    private String personName;
    
    @OneToMany(mappedBy = "person", fetch = FetchType.EAGER)
    private List<Laptop> laptops;

    public Person() {
    }

    public Person(Integer personId, String personName, List<Laptop> laptops) {
        this.personId = personId;
        this.personName = personName;
        this.laptops = laptops;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Person{" + "personId=" + personId + ", personName=" + personName + ", laptops=" + laptops + '}';
    }
    
}

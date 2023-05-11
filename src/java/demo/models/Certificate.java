/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.models;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author prabi
 */
@Embeddable
class Certificate implements Serializable {
    
    private String course;
    private String duration;

    public Certificate() {
    }

    public Certificate(String course, String duration) {
        this.course = course;
        this.duration = duration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Certificate{" + "course=" + course + ", duration=" + duration + '}';
    }
    
}

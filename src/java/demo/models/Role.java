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
public class Role implements Serializable  {
    
    @Id
    private Integer roleId;
    private String roleName;
    
}

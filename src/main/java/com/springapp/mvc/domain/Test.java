/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.mvc.domain;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author Пользователь
 */
@Entity
@Table(name = "attribute")
public class Test implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "value")
    private String value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    
}

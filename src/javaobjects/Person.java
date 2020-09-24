/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobjects;

import java.util.Date;

/**
 *
 * @author Mula
 */
public class Person {
    private int id;
    private String name;
    private Date dateOfBirth;
    
    public Person(int id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public int getAge() {
        Date now = new Date();
        int years = now.getYear() - dateOfBirth.getYear();
                
        return years;
    }
    
    @Override
    public String toString() {
        return "My name is '" + name + "', I am '" + getAge() +"' years old";
    }
}

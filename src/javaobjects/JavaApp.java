/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobjects;

import java.text.DateFormat;
import java.util.*;

/**
 *
 * @author Mula
 */
public class JavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person another = new Person(2, "Hustler", new Date(100, 5, 20));
        Person third = new Person(3, "Msee", new Date(111, 7, 4));

        System.out.println(another.getName());
                writeLine(another);
        writeLine(third);

        writeLine(23);
        writeLine("Some Text");
        printId(another);
        printId(third);
        printId(new Date(105, 11, 2));
    }

    private static void writeLine(Object obj) {
        System.out.println(obj);
    }

    private static void printId(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            writeLine("The Id is " + p.getId());
        } else {
            writeLine(obj + " is not a Person");
        }
    }
}

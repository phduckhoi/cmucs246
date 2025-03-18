/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khoi7
 */
package com.mycompany.studentmanagement;

import com.mycompany.practices2.Student;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentTest {

    @Test
    public void testGetName() {
        Student student = new Student("S001", "John Doe", 20);
        Assert.assertEquals(student.getName(), "John Doe");
    }

    @Test
    public void testSetAge() {
        Student student = new Student("S002", "Alice", 22);
        student.setAge(25);
        Assert.assertEquals(student.getAge(), 25);
    }

    @Test
    public void testUpdateName() {
        Student student = new Student("S003", "Bob", 21);
        student.updateName("Robert");
        Assert.assertEquals(student.getName(), "Robert");
    }
}

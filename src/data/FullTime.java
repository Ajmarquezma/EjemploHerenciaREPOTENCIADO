/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class FullTime extends Professor{
    
    private float salary;

    public FullTime(float salary, String school, String department, String id, String name, Date hiringDate) {
        super(school, department, id, name, hiringDate);
        this.salary = salary;
    }
    
    @Override
    public float paySalary() {
        return this.salary;
    }
    
}

package com.example.lambda;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Oracle
 * Streams and filters
 */
public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();
    
    Predicate<Employee> allEmployees = p -> p.getAge() >= 50 && p.getDept().equals("Sales");
        
    System.out.println("\n==== RoboMail 01");    
    System.out.println("\n=== All Sales 50+");
    
    // Print sales employees 50+
    pl.stream()
            .filter(allEmployees)
            .forEach(p -> robo.roboMail(p));

  }
}

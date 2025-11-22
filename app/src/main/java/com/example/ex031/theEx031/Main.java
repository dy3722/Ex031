package com.example.ex031.theEx031;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args)
    {
        List<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(new HourlyEmployee(126534,"Harry",6247.68,30,1.2));
        allEmployees.add(new Manager(983568,"Manny",6251.68,"AI",1.1));
        allEmployees.add(new Salesperson(783853,"Shalom",6320.68,1000,6));
        allEmployees.add(new HourlyEmployee(2345673,"Voldemort",7247.68,35,1.01));
        allEmployees.add(new HourlyEmployee(8378739,"Dubi",6767.67,67,6.7)); // My favorite employee!!

        for (Employee employee : allEmployees)
        {
            System.out.println(employee);
            employee.calculateMonthlySalary();
        }

        double totalBonuses = 0;

        for (Employee employee : allEmployees)
        {
            if (employee instanceof BonusEligible)
            {
                totalBonuses += ((BonusEligible) employee).calculateBonus();
            }
        }
        System.out.println(totalBonuses);
    }
}

package com.example.ex031.theEx031;

public abstract class Employee {
    private final int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public abstract double calculateMonthlySalary();

    @Override
    public String toString() {
        return "employeeId= " + employeeId + "\n" +
               "name= " + name + "\n" +
               "baseSalary= " + baseSalary +"\n";
    }
}

package com.bitlrn.intro.arrays;

import java.util.Scanner;

public class EmployeeManagement {
    /**
     * Taking the arrays of employees data has input - prints the data
     * <note>This is for teaching purpose we should use Object to represent
     *       employee as shown as displayEmployees
     * </note>
     * @param ids
     * @param names
     * @param salaries
     */
    public void displayArrays(int[] ids, String[] names, double[] salaries){
        System.out.println("Employees Data:");
        System.out.println("ID\t\tName\t\tSalary");
        for(int i=0; i < ids.length;i++){
            System.out.println(ids[i]+"\t\t"+names[i]+"\t\t"+salaries[i]);
        }
    }

    /**
     * Taking the arrays of employees data (doesn't take Salaries) has input - prints the data
     * This is to show overload function displayArrays, one takes 3 parameters the other takes 
     * just 2 parameters.
     *  
     * <note>This is for teaching purpose we should use Object to represent
     *       employee as shown as displayEmployees
     * </note>
     * 
     * @param ids
     * @param names
     */
    public void displayArrays(int[] ids, String[] names){
        System.out.println("Employees Data:");
        System.out.println("ID\t\tName");
        for(int i=0; i < ids.length;i++){
            System.out.println(ids[i]+"\t\t"+names[i]);
        }
    }

    public void displayEmployees(Employee[] employees){
        System.out.println("Employees Data:");
        System.out.println("ID\t\tName\t\tSalary");
        for(int i =0; i < employees.length;i++){
            System.out.println(employees[i].getId()+"\t\t"
                        +employees[i].getName()
                        +"\t\t"+employees[i].getSalary());
        }
    }

    /**
     * Search employee  based on name and prints the employee info on finding one
     * <note>
     *     The arrays entry at any index is assumed to be
     * </note>
     * @param name -- the employee name to be searched
     * @param empIds - Array of Employee Ids
     * @param empNames -- Array of Employee names
     * @param salaries -- Array of Employee salaries
     * @return true if employee info was found else false
     */
    public boolean searchEmployee(String name,int[] empIds, String[] empNames,double[]salaries){
        for(int i =0 ; i < empIds.length;i++){
            if(name.equals(empNames[i])){
                System.out.println("Employee details with name "+ name
                    + " id= "+ empIds[i]
                    + " salaries="+ salaries[i]);
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args){
        EmployeeManagement empMgmt = new EmployeeManagement();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of employees data you want to enter :");
        int empSize = input.nextInt();
        /*
            declare three arrays to take each property of an Employee.
            This is done for teaching purpose and to give an idea
            how intuitive it is if we create an Employee object instead.
         */
        int[] empIds = new int[empSize];
        String[] empNames = new String[empSize];
        double[] empSalaries = new double[empSize];

        Employee[] employees = new Employee[empSize];

        System.out.println("Enter id, name, salary of each employee:");
        for(int i=0; i < empSize;++i){
            System.out.println("Enter employee id = ");
            int id = input.nextInt();
            empIds[i] = id;
            System.out.println("Enter Name of employee with id "+empIds[i]);
            String name = input.next();
            empNames[i] = name;
            System.out.println("Enter Salary of employee with id "+empIds[i]);
            double salary = input.nextDouble();
            empSalaries[i] = salary;

            /*
             instead of maintaining 3 arrays data to capture information of Employee
             it makes more sense to create an Employee object like below and
             capture all related data. The above approach of maintaining 3 separate
             arrays would be used in procedural language. The approach of mapping to
             real-world entity like Employee is used in Object Oriented programming
            */
            Employee employee = new Employee(id,name,salary);
            employees[i] = employee;
        }

        System.out.println("Displaying employees data collected in Arrays:");
        empMgmt.displayArrays(empIds,empNames,empSalaries);

        //uses overloaded function wherein just ids and names are displayed
        System.out.println("Displaying employees data collected in Arrays - just id and names:");
        empMgmt.displayArrays(empIds,empNames);

        System.out.println("Displaying employees data collected in Employees object array:");
        empMgmt.displayEmployees(employees);

        System.out.println("Enter employee name to search in Employees = ");
        String name = input.next();

        empMgmt.searchEmployee(name,empIds,empNames,empSalaries);

    }
}

class Employee{
    private final int id;
    private final String name;
    private final double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }
}
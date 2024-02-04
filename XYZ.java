package com.java.Task3;

import java.util.Scanner;

//interface com.java.Task3.Taxable is created
interface  Taxable{
    float salesTax = 7.0f/100;//datamember salesTax {7% = 7/100}
    float incomeTax = 10.5f/100;//Datamember incomeTax {10.5% = 10.5/100}
    abstract void calcTax();//abstract method has been created
}
//method com.java.Task3.Employee which inplements com.java.Task3.Taxable inteface is been created
class Employee implements Taxable {
    // incometax feild has been declared to store the incometax
    float incometax;

    // datamembers of the class com.java.Task3.Employee
    int empId;
    String name;
    int salary;

    //definition of abstract method to calculate and print incometax
    @Override
    public void calcTax() {
        incometax = incomeTax * salary;
        System.out.println("Income Tax : " + incometax);
    }
}
class Product implements Taxable{
    // salestax feild has been declared to store the salestax
    float salestax;
    // datamembers of the class com.java.Task3.Product
    int pid ;
    int price;
    int quantity;

    //definition of abstract method to calculate and print salestax
    @Override
    public void calcTax() {
        salestax = (price*quantity) *salesTax;
        System.out.println("Sales Tax : " + salestax);
    }

}

public class XYZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();//obj for class com.java.Task3.Employee

        //getting input form user
        System.out.print("Enter emp id : ");
        int empid = sc.nextInt();
        e.empId = empid;

        System.out.print("Enter emp name : ");
        String name = sc.next();
        e.name = name;

        System.out.print("Enter emp salary : ");
        int salary = sc.nextInt();
        e.salary = salary;



        Product p = new Product();//obj for class com.java.Task3.Product

        //getting input form user
        System.out.print("Enter pid : ");
        int pid = sc.nextInt();
        p.pid = pid;

        System.out.print("Enter price : ");
        int price = sc.nextInt();
        p.price = price;

        System.out.print("Enter Qunatity : ");
        int quantity = sc.nextInt();
        p.quantity =  quantity;

        //method to calculate incometax of com.java.Task3.Employee
        e.calcTax();
        //method to calculate salestax of product
        p.calcTax();

        //scanner closing
        sc.close();

    }
}

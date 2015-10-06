//Karli Pensabene
//lab 06
//Time Sheets Java Program
//
//  first compile the program
//      javac timeSheets.java
//  run the program
//      java timeSheets//

import java.util.Scanner; 

public class timeSheets {
    //main method required for every Java program 
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner (System.in);
    
    //Ask for number of employees 
    System.out.println("Enter number of employees: ");
    int numEmployees = myScanner.nextInt();
    int totalPay = 0; //initialize total pay
  
//for some integer j less than the number of employees, 
//add one to j so that it is greater than employee count and stops
for (int j = 0; j < numEmployees; j++) {

//pay, monday-friday initialized and scanned
    System.out.println("Enter pay per hour of employee: ");
    int pay = myScanner.nextInt();
    
    System.out.println("Enter hours for Monday: ");
    int monHours = myScanner.nextInt();
    
    System.out.println("Enter hours for Tuesday: ");
    int tuesHours = myScanner.nextInt();
    
    System.out.println("Enter hours for Wednesday: ");
    int wedHours = myScanner.nextInt();
    
    System.out.println("Enter hours for Thursday: ");
    int thursHours = myScanner.nextInt();
    
    System.out.println("Enter hours for Friday: ");
    int friHours = myScanner.nextInt();

//payrol initialized as zero
    int payroll=0;
    
//some up individual payroll and store
payroll = pay * (monHours + tuesHours + wedHours + thursHours + friHours);
//System.out.println("individual payroll is: " + payroll);

//add totalPay each time through the loop
totalPay= totalPay + payroll; 
}

//print total pay of all employees
System.out.println("Total Payroll is: " + totalPay);

}
}
/*
 *	Author: Jasmin Shim
 *  Date: 10/22/24
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		
		Employee pam = new Employee(1987, "Pam", "Beesly", 2250);
		pam.employeeToString();
		
		Employee kevin = new Employee(1234, "Kevin", "Malone", 1234.56);
		kevin.employeeToString();
		
		dwight.raiseSalary(15);
		double ds = dwight.getSalary();
		double das = dwight.getAnnualSalary();
		
		jim.raiseSalary(45);
		double js = jim.getSalary();
		double jas = jim.getAnnualSalary();
		
		pam.raiseSalary(50);
		double ps = pam.getSalary();
		double pas = pam.getAnnualSalary();
		
		kevin.raiseSalary(2);
		double ks = kevin.getSalary();
		double kas = kevin.getAnnualSalary();
		
	
		System.out.println("Dwight gets a salary of $" + ds + " and an annual salary of $" + das);
		System.out.println("Jim gets a salary of $" + js + " and an annual salary of $" + jas);
		System.out.println("Pam gets a salary of $" + ps + " and an annual salary of $" + pas);
		System.out.println("Kevin gets a salary of $" + ks + " and an annual salary of $" + kas);

	}
}

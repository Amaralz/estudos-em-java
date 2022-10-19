package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee empregado = new Employee();
		
		System.out.println("\nname: ");
		empregado.name = sc.nextLine();
		
		System.out.println("\nGross salary: ");
		empregado.grossSalary = sc.nextDouble();
		
		System.out.println("\nTax: ");
		empregado.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f\n",empregado.name,empregado.Netsalary());

		System.out.println("\nwich percentage to increase salary? ");
		double porcent = sc.nextDouble();
		
		empregado.increaseSalary(porcent);
		
		sc.close();
	}

}

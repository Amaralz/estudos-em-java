package entities;

public class Employee 
{
	public String name;
	public double grossSalary;
	public double tax;
	
	public double Netsalary() 
	{
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage)
	{
		
		grossSalary += grossSalary * (percentage / 100.00);
		
		double valor_final = grossSalary - tax;
		
		System.out.printf("\nUpdate data: %s, $ %.2f ",name,valor_final);
	}
}

import java.util.Scanner;
import java.util.Locale;
public class atvd2_8 {

	public static void main(String[] args) 
	{
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double total = 0;
	
	System.out.println("digite o valor do salario de uma pessoa de Lisarb: ");
	double x = sc.nextDouble();
	
	if(x >= 0.00 && x <= 2000.00)
	{
		System.out.println("isento");
	}
	if(x >= 2000.01 && x <= 3000.00)
	{
		total = (x * 8) / 100;
		System.out.println(total);
	}
	if (x >= 3000.01 && x <= 4500.00 ) 
	{
		total = (x * 18) / 100;
		System.out.println(total);
	}
	if (x >= 4500.01) 
	{
		total = (x * 28) / 100;
		System.out.println(total);
	}
	
	
	
	
	
	
		sc.close();
	}

}

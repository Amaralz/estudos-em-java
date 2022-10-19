import java.util.Scanner;
import java.util.Locale;
public class atvd2_7 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite dois valores: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x >0 && y > 0)
		{
			System.out.println("Q1");
		}
		if(x < 0 && y > 0)
		{
			System.out.println("Q2");
		}
		if(x < 0 && y < 0)
		{
			System.out.println("Q3");
		}
		if(x > 0 && y < 0)
		{
			System.out.println("Q4");
		}
		if(x == 0 && y == 0)
		{
			System.out.println("Origem");
		}else if(x == 0)
		{
			System.out.println("eixo y");
		}else if(y == 0)
		{
			System.out.println("eixo x");
		}
		
		
		
		sc.close();
	}

}

import java.util.Locale;
import java.util.Scanner;
public class atvd2_1 {

	public static void main(String[] args) 
	{
		int x;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("digite um numero inteiro para saber se ele é negativo:");
		x = sc.nextInt();
		
		if(x >= 0)
		{
			System.out.println("não negativo");
		} 
		else 
		{
			System.out.println("negativo");
		}
		
		
		
		
		sc.close();
	}

}

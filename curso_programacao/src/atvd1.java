import java.util.Locale;
import java.util.Scanner;
public class atvd1 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x,y,soma;
		System.out.println("digite dois valores para serem somados:");
		x = sc.nextInt();
		y = sc.nextInt();
		soma = x + y;
		
		System.out.println("SOMA = "+ soma);
		
		
		sc.close();

	}

}

import java.util.Locale;
import java.util.Scanner;
public class atvd2_3 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x,y;
		
		System.out.println("digite um numero inteiro ");
		x = sc.nextInt();
		System.out.println("digite mais um numero inteiro");
		y = sc.nextInt();
		
		if((x * x) %2 ==0 && (y*y)%2 == 0)
		{
			System.out.println("sao multiplos");
		}
		else 
		{
			System.out.println("nao são multiplos");
		}
		
		
		sc.close();
	}

}

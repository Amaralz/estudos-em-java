import java.util.Locale;
import java.util.Scanner;
public class atvd2 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio,pi=3.14159,area,x=2;
		
		System.out.println("digite um valor para ser o raio: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio,x);
		
		System.out.printf("area:%.4f\n",area);
		
		sc.close();

	}

}

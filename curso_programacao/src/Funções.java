import java.util.Scanner;

public class Fun��es {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a,b,c);
		
		showResult(higher);
		
		sc.close();
	}
	public static int max(int a,int b,int c)
	{
		int aux=0;
		if(a > b && a > c) 
		{
			aux = a;
		}
		if(b > a && b > c)
		{
			aux = b;
		}
		else if(c > a && c > b)
		{
			aux = c;
		}
		return aux;
		
	}
	public static void showResult(int resultado)
	{
		System.out.println("o maior numero �: " + resultado);
	}

}

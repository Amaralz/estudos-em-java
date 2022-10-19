import java.util.Locale;
import java.util.Scanner;
public class atvd3 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D,A2,B2,C2,D2,diferenca;
		
		System.out.println("digite 4 valores para ser feito a diferença: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = (A*B) - (C*D);
		
		System.out.println("diferença:"+ diferenca);
		
		
		sc.close();
	}

}

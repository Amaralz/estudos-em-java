import java.util.Scanner;
import java.util.Locale;
public class atvd5 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1,cod2,n1,n2;
		double v1,v2,vp;
		
		System.out.println("digite o codigo da peça, o numero das peças e o valor delas: ");
		cod1 = sc.nextInt();
		n1 = sc.nextInt();
		v1 = sc.nextDouble();
		
		System.out.println("digite o codigo da peça, o numero das peças e o valor delas NOVAMENTE:");
		cod2 = sc.nextInt();
		n2 = sc.nextInt();
		v2 = sc.nextDouble();
		
		vp = (n1 * v1) + (n2 * v2);
		
		System.out.printf("valor a pagar: %.2f\n",vp);
		
		sc.close();

	}

}

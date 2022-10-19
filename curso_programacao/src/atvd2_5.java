import java.util.Locale;
import java.util.Scanner;
public class atvd2_5 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x,z;
		double total;
		
		System.out.println("digite um numero para ser o codigo e a quantidade do item: ");
		x = sc.nextInt();
		z = sc.nextInt();
		
		switch(x)
		{
		case 1:{total = 4.00 * z;System.out.printf("total: R$:%.2f",total);};break;
		case 2:{total = 4.50 * z;System.out.printf("total: R$:%.2f",total);};break;
		case 3:{total = 5.00 * z;System.out.printf("total: R$:%.2f",total);};break;
		case 4:{total = 2.00 * z;System.out.printf("total: R$:%.2f",total);};break;
		case 5:{total = 1.50 * z;System.out.printf("total: R$:%.2f",total);};break;
		}
		
		
		sc.close();

	}

}

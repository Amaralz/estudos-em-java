import java.util.Scanner;
import java.util.Locale;

public class atvd2_6 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("digite um valor: ");
		double x = sc.nextDouble();
		
		if(x >= 0 && x <= 100)
		{
		if(x >=0 && x <= 25)
		{
			System.out.println("o valor se encontra dentro do intervalo de 0 a 25.");
		}
			if(x > 25 && x <= 50)
			{
				System.out.println("o valor se encontra dentro do intervalo de 25 a 50.");
			}
				if(x > 50 && x <= 75 )
				{
					System.out.println("o valor se encontra dentro do intervalo de 50 a 75.");
				}
					if(x > 75 && x <= 100)
					{
						System.out.println("o valor se encontra dentro do intervalo de 75 a 100.");
					}
		}else 
		{
			System.out.println("o valor se encontra fora dos intervalos.");
		}
		
		sc.close();
	}

}

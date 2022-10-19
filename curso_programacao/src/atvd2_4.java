import java.util.Locale;
import java.util.Scanner;

public class atvd2_4 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x,z,h;
		
		System.out.println("digite o horario do começo do jogo e o termino:");
		x = sc.nextInt();
		z = sc.nextInt();
	
		if(x < z)
		{
			h = z - x;
			
		}else 
		{
			h = (24 - x) + z; //botar 24 para retirar o horario de 24hrs da variavel e poder ser uma contagem equivalente
		}
		
			System.out.println("o jogo durou " + h + "horas");
		
		sc.close();
	}

}

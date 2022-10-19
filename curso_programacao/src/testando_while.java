import java.util.Scanner;

public class testando_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		
		while(x != 2002)
		{
			
			System.out.println("digite sua senha: ");
			x = sc.nextInt();
			if(x != 2002)
			{
				System.out.println("\n senha invalida\n");
			}
			
		}
		
		System.out.println("\n acesso permitido");
		
		sc.close();

	}

}

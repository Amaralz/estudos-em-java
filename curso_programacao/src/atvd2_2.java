import java.util.Locale;
import java.util.Scanner;
public class atvd2_2 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner(System.in);
		int x;
		
		
		System.out.println("digite um numero inteiro para sabermos se é par ou impar");
		x = sc.nextInt();

		if(x % 2 == 0)
		{
			System.out.println("par");
		}else {
			System.out.println("impar");
		}
		
		
		sc.close();
		
	}

}

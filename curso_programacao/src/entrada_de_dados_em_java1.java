
import java.util.Locale;
import java.util.Scanner;
public class entrada_de_dados_em_java1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
		double z;
		String x;
		int y;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("voce digitou: "+ x);
		System.out.println("voce digitou: "+ y);
		System.out.println("voce digitou: "+ z);
		
		/*y = sc.next().charAt(0);
		System.out.printf("voce digitou: " + y);*/
		
		sc.close();
	}

}

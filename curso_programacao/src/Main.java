import java.util.Locale;

public class Main {

	public static void main(String[] args) 
	{
		int x = 32;
		double y = 10.35784;
		String nome = "jurema";
		
		
		
		System.out.println(x);
		System.out.printf("%.2f\n",y);
		Locale.setDefault(Locale.US);
		System.out.println("RESULTADO = " + y + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", y);
		System.out.printf("%s tem %d anos e ganha %.2f reais vendendo seus produtos",nome,x,y);

	}

}

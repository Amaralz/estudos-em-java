import java.util.Locale;
public class Ex_2 {

	public static void main(String[] args) {
		String produto1 = "computador";
		String produto2 = "mesa de trabalho";
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("produtos:");
		System.out.printf("%s, valor e de: $ %.2f\n",produto1,preco1);
		System.out.printf("%s, valor e de: $ %.2f\n",produto2,preco2);
		System.out.printf("gravacao:%d anos de idade, codigo %d e genero:%s\n",idade,codigo,genero);
		System.out.printf("medida com oito lugares decimais:%.8f\n",medida);
		System.out.printf("derrota (três locais decimais):%.3f\n",medida);
		Locale.setDefault(Locale.US);
		System.out.printf("ponto decimal Real:%.3f\n",medida);
		

	}

}

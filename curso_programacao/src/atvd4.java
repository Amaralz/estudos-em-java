import java.util.Locale;
import java.util.Scanner;
public class atvd4 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n,hr;
		double valor,salario;
		
		System.out.println("digite o numero do funcionario, numero de horas trabalhadase o valor que ele recebe por hora: ");
		n = sc.nextInt();
		hr = sc.nextInt();
		valor = sc.nextDouble();
		
		salario = hr * valor;
		
		System.out.printf("number = %d\t",n);
		System.out.printf("salary = %.2f\n",salario);
		
		sc.close();

	}

}

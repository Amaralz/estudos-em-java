import java.util.Scanner;
import java.util.Locale;
public class atvd6 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,triangulo,circulo,trapezio,quadrado,retangulo,pi=3.14159;
		
		System.out.println("digite 3 valores: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		triangulo = (a*c)/2;
		circulo = Math.pow(c,2) * pi; 
		trapezio = ((a + b) * c) / 2;
		quadrado = Math.pow(b,2);
		retangulo = a * b;
		
		System.out.printf("triangulo:%.3f\n",triangulo);
		System.out.printf("circulo:%.3f\n",circulo);
		System.out.printf("trapezio:%.3f\n",trapezio);
		System.out.printf("quadrado:%.3f\n",quadrado);
		System.out.printf("retangulo:%.3f\n",retangulo);
		
		sc.close();

	}

}

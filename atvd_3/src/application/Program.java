package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		
		System.out.println("digite seu nome: ");
		aluno.name = sc.nextLine();
		
		System.out.println("digite suas 3 notas das unidades: ");
		aluno.grade1 = sc.nextDouble();
		aluno.grade2 = sc.nextDouble();
		aluno.grade3 = sc.nextDouble();
		
		if(aluno.mediaAluno() >= 60.00)
		{
			System.out.printf("FINAL GRADE = %.2f",aluno.mediaAluno());
			System.out.println("\nPASS");
		}else
		{
			double faltam = 60.00 - aluno.mediaAluno();
			System.out.printf("FINAL GRADE = %.2f",aluno.mediaAluno());
			System.out.println("\nFAILED");
			System.out.printf("MISSING %.2f POINTS",faltam);
		}

	}

}

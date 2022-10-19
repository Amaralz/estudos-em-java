import java.util.Scanner;

public class entrada_de_dados_em_java2 {

	public static void main(String[] args) 
	{
		int x;
		Scanner sc = new Scanner(System.in);
		
		String s1,s2,s3;
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("dados digitados");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		 
		sc.close();
		
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class program 
{

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle.result());
		
		sc.close();

	}

}


public class Funções_Strings {

	public static void main(String[] args) 
	{
		String original ="abcde FHGIJ ABC abc DEFG   ";
		String s = "potato apple lemon";
		
		String s01 = original.toLowerCase(); // converter para letras minusculas
		String s02 = original.toUpperCase(); // converter para letras maiusculas
		String s03 = original.trim(); // apaga os espaçoes vazios no final da string
		String s04 = original.substring(2); // só mostra do segundo caracter em diante
		String s05 = original.substring(2,9); // recortar oq estiver fora entre desse intervalo pedido
		String s06 = original.replace('a','x'); //faz a troca, no qual onde tiver a letra "a" minusculo na string, ira substituir pelo "x"
		int i = original.indexOf("bc"); // primeira indicação de achar essas strings ele pega a primeira posição e retorna o valor da posição
		int j = original.lastIndexOf("bc");
		
		System.out.println("original: -" + original + "-");
		System.out.println("toLowerCase: -"+ s01 + "-\n");
		
		System.out.println("original: -" + original + "-");
		System.out.println("toUpperCase: -"+ s02 + "-\n");

		System.out.println("original: -" + original + "-");
		System.out.println("trim: -"+ s03 + "-\n");
		
		System.out.println("original: -" + original + "-");
		System.out.println("trim: -"+ s04 + "-\n");
		
		System.out.println("original: -" + original + "-");
		System.out.println("trim: -"+ s05 + "-\n");
		
		System.out.println("original: -" + original + "-");
		System.out.println("index Of 'bc': -"+ i + "-\n");
		
		System.out.println("original: -" + original + "-");
		System.out.println("last Index Of 'bc': -"+ j + "-\n");
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
	}

}

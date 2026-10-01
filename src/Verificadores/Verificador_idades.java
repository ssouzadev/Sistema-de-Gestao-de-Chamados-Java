package Verificadores;
import java.util.*;

public class Verificador_idades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Digite seu nome: ");
		nome = scanner.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = scanner.nextInt();
		
		if (idade >= 18){
			System.out.println("Você é maior de idade!");
		}else{
				System.out.println("Você é menor de idade!");
			}
		}

}

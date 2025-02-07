package program;

import java.util.Scanner;
import entities.Studants;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Studants infoStud=new Studants();
		
		System.out.println("BEM-VINDO AO PROGRAMA DE NOTAS!");
		
		System.out.println("Digite o nome do Aluno: ");
		infoStud.name=sc.nextLine();
		System.out.println("Digite as notas do aluno do primeiro trimestre: ");
		infoStud.n1=sc.nextDouble();
		System.out.println("Digite as notas do aluno do segundo trimestre: ");
		infoStud.n2=sc.nextDouble();
		System.out.println("Digite as notas do aluno do terceiro trimestre: ");
		infoStud.n3=sc.nextDouble();
		
		System.out.println("Aluno: "+infoStud.name);
		infoStud.result();
		
	
		sc.close();
	}

}

package aula08;

import java.util.Scanner;

public class media_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		//entradas
	System.out.println("Digite o nome do aluno: ");
	String nome = scn.next();
	
	System.out.println("Digite a turma: ");
    String turma = scn.next();
	
    System.out.println("Digite a disciplina: ");
	String disciplina = scn.next();
	
	
	
	System.out.println("Digite a primeira nota");
	double not1 = scn.nextDouble();
	
	System.out.println("Digite a segunda nota");
    double not2 = scn.nextDouble();
	
	System.out.println("Digite a terceira nota");
    double not3 = scn.nextDouble();
    
    System.out.println("Digite a quarta nota");
    double not4 = scn.nextDouble();
    
    //processamento
    double mf = (not1 + not2 + not3 + not4) / 4;
    
    //Saída
    double media_final = (not1 + not2 + not3 + not4) / 4;
    System.out.println("Seu nome é " + nome);
    System.out.println("Sua disciplina é: " + disciplina);
    System.out.println("Sua média final é: "+ media_final);
    
    
	

	}

}

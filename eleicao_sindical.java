package aula08;

import java.util.Scanner;

public class eleicao_sindical {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 
		//entradas
		System.out.println("Quantidade de votos candA: ");
		int cand1 = scn.nextInt();
		
		System.out.println("Quantidade de votos candB: ");
		int cand2 = scn.nextInt();
		
		System.out.println("Quantidade de votos candC: ");
        int cand3 = scn.nextInt();
        
        System.out.println("Quantidade de votos nulos: ");
        int nulo = scn.nextInt();
        
        System.out.println("Quantidade de votos em branco: ");
        int branco = scn.nextInt();
        
        //processamentos
        int total_eleitores = cand1 + cand2 + cand3 + branco + nulo;
        
        //o percentual corresponde de votos válidos em relação
        //a quantidade de eleitores;
       
        int perc_validos = (cand1 + cand2 + cand3) * 100 / 10;
        
        int perc_cand1 = (cand1 * 100) / 10;
        int perc_cand2 = (cand2 * 100) / 10;
        int perc_cand3 = (cand3 * 100) /10;
        int perc_nulo = (nulo * 100) / 10;
        int perc_branco = (branco * 100) / 10;
        
        //saídas
        System.out.println("Total de eleitores: " + total_eleitores);
        
        System.out.println("Percentual de votos válidos: " + perc_validos);
        
        System.out.println("Percentual de votos válidos candidato A: " + perc_cand1);
        
         System.out.println("Percentual de votos válidos candidato B: " + perc_cand2);
         
         System.out.println("Percentual de votos válidos candidato C: " + perc_cand3);
         
         System.out.println("Percentual de votos nulos: "+ perc_nulo);
         
         System.out.println("Percentual de votos em branco"+ perc_branco);
	}

}

package AtividadeVetor;

import java.util.*;


public class Maior_Entrada {

	public static void main(String[] args) {
		Scanner ler_teclado= new Scanner(System.in);
		int vetor[] = new int[4];
		
     	for (int i = 0; i < vetor.length; i++) {
     	System.out.println("Digite um valor para a posição" + vetor[i] + "do vetor");
     	vetor[i] = ler_teclado.nextInt();
    	 
     }
     
	 int maior1 = Integer.MIN_VALUE;
     int maior2 = Integer.MIN_VALUE;

	  for (int i = 0; i < vetor.length; i++) {
		 if (vetor[i] > maior1) {
		            maior2 = maior1;
		            maior1 = vetor[i];
		        } else if (vetor[i] > maior2) {
		            maior2 = vetor[i];
		        }
		    }

		    System.out.println("O primeiro maior número é: " + maior1);
		    System.out.println("O segundo maior número é: " + maior2);

	}

}

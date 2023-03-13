package AtividadeVetor;

import java.util.Scanner;

public class MaiorNumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int vetor[] = new int[2];
	        buscarMaior(vetor);

	    }

	    private static void buscarMaior(int[] vetor) { //Método para buscar buscar Maior vetor
	        int maior = 0;

	        for (int i = 0; i < vetor.length; i++) {
	            System.out.println("Digite um valor para a posição: " + i);
	            Scanner teclado = new Scanner(System.in); //invocada a classe Scanner, o compilador pedirá para fazer a seguinte importação:
	            String valor = teclado.nextLine(); // //import java.util.Scanner;
	            vetor[i] = Integer.parseInt(valor);
	            if (vetor[i] > maior) {
	                maior = vetor[i];

	            }

	        }
	        System.out.println("\nO maior número do vetor é: " + maior);
	        // Ou return maior;
	    }

	}



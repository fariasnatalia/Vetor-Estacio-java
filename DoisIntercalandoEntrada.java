package AtividadeVetor;

import java.util.Scanner;
public class DoisIntercalandoEntrada {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); //<--Instanciando o objeto para a leitura

        int VetorX[] = new int[3];
        int VetorY[] = new int[3]; // Declaração de vetores
        int VetorZ[] = new int[6];

        int i = 0; // variável de controle
        int j = 0; // variável para intercalação

        for (i = 0; i < 3; i++) { // Recebendo os dados de entrada armazendando no vetor!
            System.out.println("Informe o valor para a posição " + (i + 1) + " do VetorX");
            VetorX[i] = Integer.parseInt(in.nextLine());
        }
        for (i = 0; i < 3; i++) { // Recebendo os dados de entrada armazendando no vetor!
            System.out.println("Informe o valor para a posição " + (i + 1) + " do VetorY");
            VetorY[i] = Integer.parseInt(in.nextLine());
        }

        for (i = 0; i < 3; i++) { // Para o vetorC receber os valores do outros dois vetores e exibir
            // intercalando!
            VetorZ[j] = VetorX[i];
            j++;
            VetorZ[j] = VetorY[i];
            j++;
        }
        System.out.println("\n Parabéns Gata Agora veja como ficou o vetor Z \n");
        System.out.println("Dados do VetorZ");
        for (j = 0; j < 6; j++) {
            System.out.println(VetorZ[j]);
            System.out.println("-------------");
        }
	}

}

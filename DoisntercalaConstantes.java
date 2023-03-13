package AtividadeVetor;

public class DoisntercalaConstantes {
	  public static void main(String[] args) {

	        int VetorA[] = {2, 5, 6, 8, 3, 8, 1, 7};
	        int VetorB[] = {1, 9, 1, 0, 4, 7, 3, 4};// Declaração de vetores
	        int VetorC[] = new int[VetorA.length + VetorB.length]; // Declaração do terceiro vetor recebendo os primeiros
	        // através do atributo length***!

	        int i = 0; // variável de controle
	        int j = 0; // variável para intercalação

	        for (i = 0; i < 8; i++) { // Para o vetorC receber os valores do outros dois vetores e exibir
	            // intercalando!
	            VetorC[j] = VetorA[i];
	            j++;
	            VetorC[j] = VetorB[i];
	            j++;
	        }
	        System.out.println("O terceiro Vetor ficou com: ");
	        for (j = 0; j < 16; j++) {
	            System.out.println(VetorC[j]);
	            System.out.println("---------------- ");
	        }

	    }


}

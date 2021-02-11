package DateArrayString.Date;

import java.util.Scanner;

public class MenorEMaiorElementoVetor {
    public static void main(String[] args){

        Scanner valorDeEntrada = new Scanner(System.in);

        int vetor[] = new int[7];

        //Entrada de Dados
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Informe o " + (i+1) + "/" + vetor.length + ": ");
            vetor[i] = valorDeEntrada.nextInt();
        }

        //Processamento: definindo o maior e o menor valor
        int menor = vetor[0];
        int maior = vetor[0];

        for(int i = 0; i < vetor.length; i++){

            if(vetor[i] < menor){
                menor = vetor[i];
            } else if(vetor[i] > maior){
                maior = vetor[i];
            }

        }

        //Saída (Resultados)
        for(int i = 0; i < vetor.length; i++){

            if(vetor[i] == menor){
                System.out.println("V[" + i +"] = " + vetor[i] + " //Menor valor");
            } else if(vetor[i] == maior){
                System.out.println("V[" + i +"] = " + vetor[i] + " //Maior valor");
            } else {
                System.out.println("V["+ i + "] " + " = " +vetor[i]);
            }

        }

    }
}

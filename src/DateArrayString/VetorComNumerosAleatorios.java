package DateArrayString;

import java.util.Scanner;

public class VetorComNumerosAleatorios {
    public static void main(String[] args){

        Scanner entradaDeDados = new Scanner(System.in);

        int vetorNumerosAleatorios[] = new int[10];

        for(int i = 0; i < vetorNumerosAleatorios.length; i++){

            vetorNumerosAleatorios[i] = (int) Math.round(Math.random() * 100);

        }

        System.out.print("Informe um número inteiro: ");
        int numeroDeEntrada = entradaDeDados.nextInt();

        System.out.println("Resultado.............................");

        int contador = 0;
        for(int i = 0; i < vetorNumerosAleatorios.length; i++){
            if(vetorNumerosAleatorios[i] > numeroDeEntrada){

                contador++;
                System.out.println("vetorNumerosAleatorios[" + i + "] = " + vetorNumerosAleatorios[i] + " <---- " + contador + " maior");

            } else {
                System.out.println("vetorNumerosAleatorios[" + i + "] = " + vetorNumerosAleatorios[i]);
            }
        }

        System.out.println("......................................");
        System.out.printf("Há %d elementos no vetor maiores do que %2d.\n", contador, numeroDeEntrada);
    }
}

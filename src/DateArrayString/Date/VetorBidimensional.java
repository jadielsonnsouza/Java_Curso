package DateArrayString.Date;

import java.util.Scanner;

public class VetorBidimensional {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        //Declarando a matriz 'm' de inteiros 2 por 4
        int nl = 2, nc = 4, i, j;
        int m[][] = new int[nl][nc];

        for(i = 0; i < nl; i++){
            System.out.printf("\nInforme os elementos %dª linha: \n",(i+1));
            for(j = 0; j < nc; j++){
                System.out.printf("m[%d][%d] = ", i, j);
                m[i][j] = ler.nextInt();
            }
        }

        for(i = 0; i < nl; i++){
            System.out.printf("\n%dª linha: \n",(i+1));
            for(j = 0; j < nc; j++){
                System.out.printf("%d ",m[i][j]);
            }
        }

    }
}

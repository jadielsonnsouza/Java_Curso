package DateArrayString.Date;

import java.util.Scanner;

public class LocalizandoElementoMatriz {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int n = 3; //ordem da matriz quadrada
        int m[][] = new int[n][n]; //matriz quadrada nxn
        int i, j;

        int x, lin = 0, col = 0;
        boolean achou = false;

        //entrada de dados
        for(i = 0; i < n; i++){
            System.out.printf("Informe os elementos da %dª linha:\n", (i+1));
            for(j = 0; j < n; j++){
                System.out.printf("m[%d][%d] = ", i, j);
                m[i][j] = ler.nextInt();
            }
            System.out.printf("\n");
        }

        System.out.printf("Informe o valor a ser procurado:");
        x = ler.nextInt();

        //processamento: localizando a posição do elemento "x"
        for(i = 0; (i < n) && (achou == false); i++){
            for(j = 0; (j < n) && (achou == false); j++){
                if(m[i][j] == x){
                    achou = true; //Se o elemtno "x" for encontrado
                    lin = i;
                    col = j;
                }
            }
        }

        //Mostrando a matriz e o resultado da pesquisa
        System.out.printf("\n");
        for(i = 0; i < n; i++){
            System.out.printf("%dª linha: ", (i+1));
            for(j = 0;j < n; j++){
                System.out.printf("%d ", m[i][j]);
            }
            System.out.printf("\n");
        }

        if( achou ==  true){
            System.out.printf("\n%d foi encontrado na %dª linha, %dª coluna\n", x, (lin+1), (col+1));
        } else {
            System.out.printf("\n%d \"não\" foi encontrado\n", x);
        }
    }
}

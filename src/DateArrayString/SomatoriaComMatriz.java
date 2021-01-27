package DateArrayString;

public class SomatoriaComMatriz {
    public static void main(String[] args){

        int n = 4, i, j;
        int m[][] = {{1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,16}};

        //declarndo os somatórios
        int smLinha, smTodos = 0;

        for(i = 0; i < n; i++){
            System.out.printf("\n%dª linha | ", (i+1));
            //definindo a soma dos elementos da i-ésima linha
            smLinha = 0;

            for(j = 0; j < n; j++){
                System.out.printf("m[%d][%d] = %2d | ", i, j, m[i][j]);

                //somando os elementos da j-ésima coluna
                smLinha += m[i][j];
            }

            System.out.printf(", soma = %d\n", smLinha);

            //Definindo a soma de todos elementos da matriz
            smTodos += smLinha;
        }

        System.out.printf("\nSoma Totatl = %d\n",smTodos);

    }
}

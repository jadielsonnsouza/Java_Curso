package DateArrayString;

public class PassandoMatrizesParaMetodos {
    public static void main(String[] args){

        int m1[][] = { {1,2,3}, {4,5} };
        int m2[][] = { {1,2}, {3}, {4,5,6,7,8,9} };

        mostrarMatriz("1ª Matriz", m1);
        System.out.printf("-----------------\n");
        mostrarMatriz("2ª Matriz,", m2);

    }

    //Método mostraMatriz()
    public static void mostrarMatriz(String s, int m[][]){
        int i, j, nl, nc;

        System.out.printf("%s\n ", s);
        System.out.printf("-------------------\n");

        nl = m.length; //determina o numero de linha da matriz

        for(i = 0; i < nl; i++){
            System.out.printf("%dª linha: ", (i+1));

            nc = m[i].length; // determina o número de colunas da i-ésima linha

            for(j = 0; j < nc; j++){
                System.out.printf("%d ", m[i][j]);
            }
            System.out.printf("\n");
        }
    }
}

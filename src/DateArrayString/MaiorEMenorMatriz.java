package DateArrayString;

public class MaiorEMenorMatriz {
    public static void main(String[] args){

        int n = 5;
        int M[][] = new int[n][n];
        int i, j;

        //Alimentando e mostrando os elementos da matriz
        for(i = 0; i < n; i++){
            System.out.printf("%dª Linha ",(i+1));
            for(j = 0; j < n; j++){
                //Sorteia um número aleatório no intervalo de 0 até 100
                M[i][j] = (int)(Math.round(Math.random() * 100));

                System.out.printf("%3d ", M[i][j]);
            }

            System.out.printf("\n");
        }

        //Localizando a posição (Linha e Coluna) do menor e do maior valor
        int linMenor = 0, colMenor = 0;
        int linMaior = 0, colMaior = 0;

        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){

                //Definindo a posição do menor valor
                if(M[i][j] < M[linMenor][colMenor]){

                    linMenor = i;
                    colMenor = j;

                } else if(M[i][j] > M[linMaior][colMaior]){ //Definindo a posição do amior valor

                    linMaior = i;
                    colMaior = j;

                }
            }
        }

        System.out.printf("\nMenor valor = %3d |%dª linha, %dª coluna|",
                            M[linMenor][colMenor], (linMenor+1), (colMenor+1));

        System.out.printf("\nMaior valor = %3d |%dª linha, %dª coluna|",
                            M[linMaior][colMaior], (linMaior+1), (colMaior+1));

    }
}

package DateArrayString.Date;

public class MatrizQuadrada {
    public static void main(String[] args){

        int n = 6;
        int M[][] = new int[n][n];
        int i, j;

        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){

                //diagonal PRINCIPAL
                if(i == j){
                    M[i][j] = 0;
                } else if((i+j) == (n-1)){ //diagonal Secundária
                    M[i][j] = 1;
                } else {
                    //Sorteia um número aleatório no intervalo de 2 até 5
                    M[i][j] = (int)(Math.round(Math.random() * 2) + 3);
                }
            }
        }

        for(i = 0; i < n; i++){
            System.out.printf("%dª Linha: ", (i+1));
            for(j = 0; j < n; j++){
                System.out.printf("%d ",M[i][j]);
            }
            System.out.printf("\n");
        }

    }
}

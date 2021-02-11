package DateArrayString.Date;

import java.util.Scanner;

public class InicializacaoDeVetores {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        //declarando e inicializando o vetor "estadoCivil"
        String estadoCivil[] = {"Solteiro", "Casado", "Separado", "Divorciado", "Viúvo"};

        System.out.printf("Código Estado Civil\n");
        System.out.printf("-------------------\n");

        for(int i = 0; i < estadoCivil.length; i++){
            System.out.printf("%6d %s\n", i, estadoCivil[i]);
        }

        System.out.printf("-------------------\n\n");

        System.out.printf("Informe o código do se estado civil: ");
        int codigoDigitado = ler.nextInt();

        System.out.printf("\nResultado: ");

        if((codigoDigitado >= 0) && (codigoDigitado < estadoCivil.length)){
            System.out.printf("%d = %s.\n", codigoDigitado, estadoCivil[codigoDigitado]);
        } else {
            System.out.printf("Erro, %d = código inválido.\n", codigoDigitado);
        }
    }
}

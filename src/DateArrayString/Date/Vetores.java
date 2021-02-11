package DateArrayString.Date;

public class Vetores {
    public static void main(String[] args){

        int nota[] = {80, 70, 90, 85, 100};
        int soma = 0;

        //Percorrendo todos os valores armazenados no vetor
        for(int i = 0; i < nota.length; i++){
            System.out.println("Nota " + i + " = " + nota[i]);
            soma += nota[i];
        }

        double media = soma / (double) nota.length;

        System.out.println("Média Aritmética Simples = " + media);

    }
}

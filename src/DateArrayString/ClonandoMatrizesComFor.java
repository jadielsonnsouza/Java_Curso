package DateArrayString;

import java.util.Random;

public class ClonandoMatrizesComFor {
    public static void main(String[] args){

        //(1) cria o array 'a' e o preenche com uma sequência de números aleatórios
        int [] a = new int[5];
        Random numerosRandomicos = new Random();

        for(int i = 0; i < a.length; i++){
            a[i] = numerosRandomicos.nextInt();
            System.out.println("a[" + i + "] = " + a[i]);
        }

        System.out.println();

        //(2) Copia o conteúdo de 'a' para 'b' com o uso de laço for
        int b[] = new int[a.length]; //primeiro é preciso reserva espaço para b

        for(int i = 0; i < b.length; i++){
            b[i] = a[i]; //copiado para array b tudo o que estiver em a
        }
        
        //(3) Exibindo o conteúdo de 'b'
        for(int i = 0; i < b.length; i++){
            System.out.println("b["+ i + "] = " + b[i]);
        }

    }
}

package DateArrayString.Date;

import java.util.Random;

public class MetodoClone {
    public static void main(String[] args){

        //(1) Cria o array 'a' e o preenche com uma sequencia de numeros aleatorios
        int a[] = new int[5];
        Random numeroRandomicos = new Random();

        for(int i = 0; i < a.length; i++){
            a[i] = numeroRandomicos.nextInt();
            System.out.println("a[" + i + "] = " + a[i]);
        }

        System.out.println();

        //(2) Copia o conteúdo de 'a' para 'b' com o uso do método "clone()"

        int b[] = a.clone(); //Este comando reserva espaço para 'b' e faz a cópia do conteúdo de 'a' para 'b'

        //(3) xibindo o conteúdo de b
        for(int i = 0; i < b.length; i++){
            System.out.println("b[" + i + "] = " + b[i]);
        }

    }
}

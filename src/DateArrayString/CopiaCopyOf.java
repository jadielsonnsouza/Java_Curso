package DateArrayString;

import java.util.Arrays;
import java.util.Random;
public class CopiaCopyOf {
    public static void main(String[] args){

        //Cria o array 'a' e o preenche com uma sequencia de numeros aleatórios
        int a[] = new int[5];
        Random numerosAleatorios = new Random();

        for(int i = 0; i < a.length; i++){
            a[i] = numerosAleatorios.nextInt();
            System.out.println("a[" + i + "] = " + a[i]);
        }

        System.out.println();

        //Copia o contúdo de 'a' para 'b' com o uso do método "Array.copyOf()"
        //automaticamente reserva espaço para 'b' e copia o conteúdo de 'a' para 'b'
        int b[] = Arrays.copyOf(a, a.length);

        //exibindo array 'b'
        for(int i = 0; i < b.length; i++){
            System.out.println("b[" + i + "] = " + b[i]);
        }

    }
}

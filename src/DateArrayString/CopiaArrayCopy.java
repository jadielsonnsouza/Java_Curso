package DateArrayString;

import java.util.Random;

public class CopiaArrayCopy {
    public static void main(String[] args){

        //Cria o array 'a' e o preenche com uma sequência de números aleatórios
        int a[] = new int[5];
        Random numerosAletatorio = new Random();

        for(int i = 0; i < a.length; i++){
            a[i] = numerosAletatorio.nextInt();
            System.out.println("a[" + i + "] = " + a[i]);
        }

        System.out.println();

        //Copia o conetúdo de 'a' para 'b' com o uso do método "System.arraycopy"
        int b[] = new int[a.length]; //1º reserva um espaço para 'b'

        System.arraycopy(a,0, b, 0, a.length); //Copiando

        for(int i = 0; i < b.length; i++){
            System.out.println("b[" + i + "] = " + b[i]);
        }

    }
}

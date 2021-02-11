package DateArrayString.Date;

import java.util.Arrays;
import java.util.Random;

public class TesteDesempenho1 {

    public static long startTime, endTime;

    public static void main(String[] args){

        //declaração de variável e preenche o array 'a'

        int a[] = new int[9999999];
        int b[] = new int[a.length];

        Random numeroAleatorios = new Random();

        for(int i = 0; i < a.length; i++){
            a[i] = numeroAleatorios.nextInt();
        }

        /*
         * Cópia com a abordagem comando "for"
         */

        startTime();
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
        endTime();

        System.out.println("Método com for -> tempo de processamento = " + (endTime - startTime));

        /*
        * Cópia com a abordagem método clone
        */
        startTime();
        b = a.clone();
        endTime();

        System.out.println("Método clone -> tempo de processamento = " + (endTime - startTime));

        /*
        * Cópia com a abordagem método System.arraycopy
        */
        startTime();
        System.arraycopy(a, 0, b, 0, a.length);
        endTime();

        System.out.println("Método System.arraycopy -> tempo de processamento = " + (endTime - startTime));

        /*
         *Cópia com a abordagem método Arrays.copyOf
         */
        startTime();
        b = Arrays.copyOf(a, a.length);
        endTime();

        System.out.println("Método Arrays.copyOf -> tempo de processamento = " + (endTime - startTime));



    }

    public static long startTime(){
        startTime = System.currentTimeMillis();
        return startTime;
    }

    public static long endTime(){
        endTime = System.currentTimeMillis();
        return endTime;
    }
}

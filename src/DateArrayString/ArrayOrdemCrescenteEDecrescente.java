package DateArrayString;

import java.util.Arrays;
import java.util.Collections;

public class ArrayOrdemCrescenteEDecrescente {
    public static void main(String[] args){

        String[] companies = {"Yahoo", "Vodafone", "Samsung"};

        //sorting java array in ascending order
        System.out.println("Exemplo de Ordenção Crescente em Java");
        System.out.println("Array de String Desordenada: ");
        System.out.println("-----------------------------");
        printNumbers(companies);
        System.out.println("-----------------------------");
        Arrays.sort(companies);
        System.out.println("Array de String Ordenada em Ordem Crescente: ");
        printNumbers(companies);
        System.out.println("\n");

        //Sorting java array in descending order
        System.out.println("Exemplo de Ordenção Decrescente em Java");
        System.out.println("Array de String Desordenada: ");
        System.out.println("-----------------------------");
        printNumbers(companies);
        System.out.println("-----------------------------");
        Arrays.sort(companies, Collections.reverseOrder());
        System.out.println("Array de String Ordenada em Ordem Decrescente: ");
        printNumbers(companies);
        System.out.println("\n");

        System.out.println("Classificar parte do Array em java:");
        int[] numbers = {1, 3, 2, 7, 4, 9, 5, 8, 6};
        Arrays.sort(numbers, 0, 9);
        System.out.println("Sub Array Classificado em Java: ");
        for(int num : numbers){
            System.out.println(num);
        }

    }

    public static void printNumbers(String[] companies){
        for(String company : companies){
            System.out.println(company);
        }
    }
}

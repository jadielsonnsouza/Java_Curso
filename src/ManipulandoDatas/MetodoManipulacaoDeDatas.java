package ManipulandoDatas;

import java.time.LocalDate;

public class MetodoManipulacaoDeDatas {
    public static void main(String[] args){

        LocalDate data = LocalDate.now();

        System.out.println("Ano Bissexto: " + data.isLeapYear());
        System.out.println("Número de dias do Mês: " + data.lengthOfMonth());
        System.out.println("Número de dias do ano: " + data.lengthOfYear());
        System.out.println("Menor data: " + LocalDate.MIN);
        System.out.println("maior data: " + LocalDate.MAX);

    }
}

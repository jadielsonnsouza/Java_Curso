package ManipulandoDatas;

import java.time.LocalDate;

public class UtilizandoLocalDate {
    public static void main(String[] args){

        LocalDate dataAtual = LocalDate.now();

        System.out.println(dataAtual);
        System.out.println("Dia da semana: " + dataAtual.getDayOfWeek().name());
        System.out.println("Dia da semana: " + dataAtual.getDayOfWeek().ordinal());
        System.out.println("Mês: " + dataAtual.getMonth().name());
        System.out.println("Mês: " + dataAtual.getMonthValue());
        System.out.println("ANo: " + dataAtual.getYear());

    }
}

package ManipulandoDatas;

import java.time.LocalDate;

public class ManipulandoLocalDate {
    public static void main(String[] args){

        LocalDate dataManipulacao = LocalDate.now();

        System.out.println("Data Original: " + dataManipulacao);
        System.out.println("Mais 5 dias: " + dataManipulacao.plusDays(5));
        System.out.println("Mais 5 semanas: " + dataManipulacao.plusWeeks(5));
        System.out.println("Mais 5 anos: " + dataManipulacao.plusYears(5));
        System.out.println("Mais 2 meses: " + dataManipulacao.plusMonths(2));
        System.out.println("Menos 1 ano: " + dataManipulacao.minusYears(1));
        System.out.println("Menos 1 mês: " + dataManipulacao.minusMonths(1));
        System.out.println("Menos 3 dias: " + dataManipulacao.minusDays(3));
        
    }
}

package ManipulandoDatas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatandoData {
    public static void main(String[] args){

        LocalDate diaAtual = LocalDate.now();

        DateTimeFormatter formatoComBarras = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatadorComTraco = DateTimeFormatter.ofPattern("dd-MM-yy");

        System.out.println("Data com Barra: " + diaAtual.format(formatoComBarras));
        System.out.println("Data com traço: " + diaAtual.format(formatadorComTraco));

    }
}

package ManipulandoDatas;

import java.time.LocalDate;
import java.time.Period;

public class ComparandoDatas {
    public static void main(String[] args){

        LocalDate dataAntiga = LocalDate.of(2001,7,11);
        LocalDate dataAtual = LocalDate.of(2021,1,11);

        System.out.println(dataAntiga.isAfter(dataAtual)); //Compara se a dataAntiga é após dataAtual (False)
        System.out.println(dataAntiga.isBefore(dataAtual));//Compara se a dataAntiga é antes dataAtual (True)
        System.out.println(dataAntiga.isEqual(dataAtual)); //Compara se a dataAntiga é igual dataAtual (False)

        Period periodoEntreDatas = Period.between(dataAntiga,dataAtual);

        System.out.println("\nTempo decorrido entre " + dataAntiga + " e " + dataAtual);
        System.out.println(periodoEntreDatas.getYears() + " anos, "
                           + periodoEntreDatas.getMonths() + " meses, "
                           + periodoEntreDatas.getDays() + " dias");

    }
}

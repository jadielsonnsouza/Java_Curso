package ManipulandoDatas;

import java.time.*;

public class ComparandoDatasComFusoHorario {
    public static void main(String[] args){

        LocalDateTime dataEHora = LocalDateTime.of(2021, Month.JANUARY, 13,20,28);

        ZoneId fusoHorarioSaoPaulo = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime horaSaoPaulo = ZonedDateTime.of(dataEHora, fusoHorarioSaoPaulo);
        System.out.println(horaSaoPaulo);

        ZoneId fusoHorarioParis = ZoneId.of("Europe/Paris");
        ZonedDateTime horaParis = ZonedDateTime.of(dataEHora, fusoHorarioParis);
        System.out.println(horaParis);

        ZoneId fusoHorarioBerlin = ZoneId.of("Europe/Berlin");
        ZonedDateTime horaBerlin = ZonedDateTime.of(dataEHora, fusoHorarioBerlin);
        System.out.println(horaBerlin);

        ZoneId fusoHorarioTokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime horaTokyo = ZonedDateTime.of(dataEHora, fusoHorarioTokyo);

        Duration diferencaDeHorarioSaoPauloEParis = Duration.between(horaSaoPaulo,horaParis);
        System.out.println("\n" + diferencaDeHorarioSaoPauloEParis.getSeconds()/60/60 + " horas de diferença de São Paulo / Paris");

        Duration diferencadeHorarioParisEBerlin = Duration.between(horaParis, horaBerlin);
        System.out.println("\n" + diferencadeHorarioParisEBerlin.getSeconds()/60/60 + " horas de diferença de Paris / Berlin");

        Duration diferecaDeHorarioSaoPauloETokyo = Duration.between(horaSaoPaulo, horaTokyo);
        System.out.println("\n" + diferecaDeHorarioSaoPauloETokyo.getSeconds()/60/60 + " horas de diferença de São Paulo / Tokyo");

    }
}

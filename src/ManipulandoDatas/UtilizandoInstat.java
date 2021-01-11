package ManipulandoDatas;

import com.sun.xml.internal.fastinfoset.util.DuplicateAttributeVerifier;

import java.time.Duration;
import java.time.Instant;

public class UtilizandoInstat {
    public static void main(String[] args){

        Instant tempoInicial = Instant.now();

        try {
            Thread.sleep(60000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        Instant tempoFinal = Instant.now();

        Duration duracaoEntrePeridos = Duration.between(tempoInicial,tempoFinal);

        System.out.println("Duração em nanos segundos: " + duracaoEntrePeridos.toNanos());
        System.out.println("Duração em minutos: " + duracaoEntrePeridos.toMinutes());
        System.out.println("Duração em horas: " + duracaoEntrePeridos.toHours());
        System.out.println("Duração em milisegundos: " + duracaoEntrePeridos.toMillis());
        System.out.println("Duração em dias: " + duracaoEntrePeridos.toDays());

    }
}

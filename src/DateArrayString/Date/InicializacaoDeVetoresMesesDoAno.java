package DateArrayString.Date;

import javax.swing.*;

public class InicializacaoDeVetoresMesesDoAno {
    public static void main(String[] args){

        //declarando e inicializando os vetores 'mes' e 'diasMes'
        String mes[] = {"janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
                        "Setembro", "Outubro", "Novembro", "Dezembro"};

        int diasMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i = 0; i < 12; i++){
            System.out.printf("Mês %2d = %9s, tem %d dias.\n", (i+1), mes[i], diasMes[i]);
        }

    }
}

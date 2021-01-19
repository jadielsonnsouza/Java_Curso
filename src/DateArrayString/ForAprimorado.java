package DateArrayString;

public class ForAprimorado {
    public static void main(String[] args){

        String semaforo[] = {"Vermelho", "Amarelo", "Verde"};

        System.out.printf("Ordem de um Semáforo:\n");

        for(String sinal : semaforo){
            System.out.printf("%s\n",sinal);
        }

    }
}

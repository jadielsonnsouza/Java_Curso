package DateArrayString.String;

public class MetodosClasseString2 {
    public static void main(String[] args){

        String texto = " Utilizando o método trim() ";
        System.out.println(texto);
        texto = texto.trim();
        System.out.println(texto);

        texto = "001MARCOS PAULO      M19803112";
        String procurado = "MARCOS";
        System.out.println("\n" + texto.contains(procurado));

    }
}

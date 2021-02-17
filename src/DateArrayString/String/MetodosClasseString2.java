package DateArrayString.String;

public class MetodosClasseString2 {
    public static void main(String[] args){

        //Método trim()
        String texto = " Utilizando o método trim() ";
        System.out.println(texto);
        texto = texto.trim();
        System.out.println(texto);

        //Método contains()
        texto = "001MARCOS PAULO      M19803112";
        String procurado = "MARCOS";
        System.out.println("\nUtilizando contains() = " + texto.contains(procurado) + "\n");

        //Método length()
        System.out.print("Utilizando length() = ");
        System.out.println(" Java ".length());
        System.out.print("Utilizando trim() & length() = ");
        System.out.println(" Java ".trim().length());

        

    }
}

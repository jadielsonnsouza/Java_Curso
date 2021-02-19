package DateArrayString.String;

public class MatodosClasseString3 {
    public static void main(String[] args){

        String java = "Mundo Java";
        System.out.println(java.charAt(6)); // Retornar o caracter que estiver na posíção do indice

        System.out.println(java.concat(" DevMedia"));//Concatena a String com parametro passado

        System.out.println(java.indexOf('J'));// retorna a posição do indice encontrada na string

        System.out.println(java.startsWith("Mund")); //Retorna a true se a String iniciar com o parametro passado

        System.out.println(java.endsWith("Jav")); //Retorna a true se a String finalizar com o parametro passad

        System.out.println(java.equalsIgnoreCase("mundo jav")); //Compara se duas Strings são iguais

    }
}

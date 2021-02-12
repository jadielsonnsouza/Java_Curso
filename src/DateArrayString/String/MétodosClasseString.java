package DateArrayString.String;

public class MétodosClasseString {
    public static void main(String[] args){

        /*
        * Método replace()
        */
        String texto1 = "Este comentário foi péssimo!";
        System.out.println(texto1);
        texto1 = texto1.replace("péssimo", "ruim");
        System.out.println(texto1);

        String texto2 = "Que dia maravilhoso, por mais um dia assim";
        System.out.println("\n" + texto2);
        texto2 = texto2.replace("dia", "noite");
        System.out.println(texto2);

        String texto3 = "arara";
        System.out.println("\n" + texto3);
        texto3 = texto3.replace('a', 'e');
        System.out.println(texto3);

        String texto4 = "a rara arara de araraquara";
        System.out.println("\n" + texto4);
        texto4 = texto4.replace('a', 'o');
        System.out.println(texto4);
        
    }
}

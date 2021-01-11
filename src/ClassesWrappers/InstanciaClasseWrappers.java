package ClassesWrappers;

public class InstanciaClasseWrappers {
    public static void main(String[] args){

        Integer i1 = new Integer(101);
        Integer i2 = new Integer("302");
        System.out.println("Integer com argumento tipo inteiro: " + i1);
        System.out.println("Integer com argumento tipo String: " + i2);

        Double d1 = new Double(3.9);
        Double d2 = new Double("2.22");
        System.out.println("\nDouble com argumento tipo double: " + d1);
        System.out.println("Double com argumento tipo String: " + d2);

        Character z1 = new Character('z');
        System.out.println("\nCharacter com argumento tipo char: " + z1);

        Boolean b1 = new Boolean("true");
        Boolean b2 = new Boolean("TRUE");
        Boolean b3 = new Boolean("false");
        Boolean b4 = new Boolean("qualquer coisa sem ser true é false");
        Boolean b5 = new Boolean(true);

        System.out.println("\nBoolean com argumento tipo String(\"true\"): " + b1);
        System.out.println("Boolean com argumento tipo String(\"TRUE\"): " + b2);
        System.out.println("Boolean com argumento tipo String(\"false\"): " + b3);
        System.out.println("Boolean com argumento tipo String(\"qualquer coisa sem ser true é false\"): " + b4);
        System.out.println("Boolean com argumento tipo boolean: " + b5);

    }
}

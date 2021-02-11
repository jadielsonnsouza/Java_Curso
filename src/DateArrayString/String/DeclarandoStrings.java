package DateArrayString.String;

public class DeclarandoStrings {
    public static void main(String[] args){

        String minhaString1 = new String();
        minhaString1 = "Java1";
        System.out.println(minhaString1);

        String minhaString2 = "Java2";
        System.out.println(minhaString2);

        String minhaString3 = new String("Java3");
        System.out.println(minhaString3);

        String minhaString4 = "";
        System.out.println(minhaString4);

        char[] meusChars = new char[] {'J', 'a', 'v', 'a', '4'};
        String minhaString5 = new String(meusChars);
        System.out.println(minhaString5);

    }
}

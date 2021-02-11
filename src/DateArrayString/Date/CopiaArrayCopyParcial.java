package DateArrayString.Date;

public class CopiaArrayCopyParcial {
    public static void main(String[] args){

        //Cria o array 'a' e o preenche com os caracteres da palavra 'utopia'
        char a[] = {'u', 't', 'o', 'p', 'i', 'a'};

        //Copia apenas a palavra 'top' para o array 'b', usando "System.arraycopy()
        char b[] = new char[3]; // 1º reserva espaço para 'b'

        System.arraycopy(a,1, b, 0, 3);

        for(int i = 0; i < b.length; i++){
            System.out.println("b[" + i + "] = " + b[i]);
        }

    }
}

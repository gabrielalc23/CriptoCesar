import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String sAberto  = JOptionPane.showInputDialog(
                "Digite o texto a ser criptografado"
        );
        int iChave      = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a chave")
        );
        String sCifrado = "";

        for (int i      = 0;
                i< sAberto.length();
             i++){

//            O método charAt pega a letra na posição
//            Indicada. COnvertendo a letra para
//            Inteiro, Ela se converte em ASCII

            int iChar   = (int) (
                sAberto.charAt(i)
            );
//        Se for != de espaço

            if (iChar != 32){

            //Acrescentar o valor da chave

            iChar += iChave;
            //iChar = iChar + iChave
        }

        //Converte de volta para caracter r
        //Acumula na String para exibir o cifrado

        sCifrado+=(char)(iChar);
        JOptionPane.showMessageDialog(
                null, "Texto cifrado\n" + sCifrado
        );
        }
    }
}
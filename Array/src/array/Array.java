package array;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Array {

    public static void main(String[] args) {
       String saida = "";
       String valores ="Vaores inseridos: ";
       int array [] = new int[30];
       
       for (int i = 0; i < 30; i++){
           array[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor "));
           valores=valores+array[i]+" ";
           if(array[i]>22)
               saida=saida+"Numero"+array[i]+"É maior que 22 graus e esta na posição" +(i+1)+"\n";
           }
           JOptionPane.showMessageDialog(null,valores+"\n"+saida);
        }
    }    


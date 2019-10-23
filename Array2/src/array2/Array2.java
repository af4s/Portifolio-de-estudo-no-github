package array2;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Array2 {

    public static void main(String[] args) {
         String saida = "";
       String valores ="Vaores inseridos: ";
       int array [] = new int[10];
       
       for (int i = 0; i < 10; i++){
           array[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor "));
           valores=valores+array[i]+" ";
           if(array[i] %2 == 0)
               saida=saida+"O número "+array[i]+" é par e esta na posição" +(i+1)+"\n";
           }
           JOptionPane.showMessageDialog(null,valores+"\n"+saida);
        }
      }

    
    


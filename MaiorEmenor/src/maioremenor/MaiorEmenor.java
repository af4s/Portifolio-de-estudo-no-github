
package maioremenor;
import javax.swing.JOptionPane;

public class MaiorEmenor {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int array [] = new int [20]; 
	Integer valorMenor = null;
	Integer valorMaior = null;
	
        
        
        for(int x=0;x<=array.length-1;x++){
		array[x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
               
                
		if(valorMenor==null && valorMaior== null){
			valorMenor = array[x];
			valorMaior = array[x];
		}

		if( valorMenor >  array[x])
			valorMenor=array[x];
		if(valorMaior < array[x] )
			valorMaior=array[x];
	}
        JOptionPane.showMessageDialog(null,"Menor nota: " + valorMenor + " Maior nota: " + valorMaior);
//System.out.println("Valor Menor: " + valorMenor + "ValorMaior: " + valorMaior);
    }
    
}

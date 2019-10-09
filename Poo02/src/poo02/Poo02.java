
package poo02;

public class Poo02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor="Azul";
        c1.ponta=0.5f;
        c1.destampar();
        //Atributo é atribuido com simbolo de =
        //Método recebe um parametro podendo colocar em "()" 
        //mesmo que nao tenha parametro tem que colocar "()"
        c1.rabiscar();
        
        //c1.status();
        c1.status(); 
        
       Caneta c2 = new Caneta();
       c2.modelo = "Bic";
       c2.cor = "preta";
       c2.destampar();
       c2.rabiscar();
       
       c2.status();
        
    }
    
    
}

package poo02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //Mostrar o estado do objeto
    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    // void significa sem retorno
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERROR! Não posso rabiscar. ");
        } else {
            System.out.println("Estou Rasbiscando ");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}

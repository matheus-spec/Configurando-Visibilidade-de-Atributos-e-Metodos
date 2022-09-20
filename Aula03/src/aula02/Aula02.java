package aula02;
public class Aula02 {
    public static void main(String[] args) {
        CanetaPreta c1 = new CanetaPreta();  
        c1.modelo="BIC cristal";
        c1.cor="Azul";
       // c1.ponta= 0.5f; 
        c1.carga = 80;
       // c1.tampada = true;
        c1.status();
        c1.rabiscar();
        c1.destampar();
             
    }
    
}

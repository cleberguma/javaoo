
package conta;


public class teste {
    
    public static void main(String[] args) {
     Conta c1 = new Conta();
     
     c1.nome="cleber";
     c1.numero=1234;
     c1.saldo=400.00;
     
     Conta c2 = new Conta();
     
     c2.nome="cleber";
     c2.numero=1234;
     
     c1.transfere(c2,100);
     
     
        System.out.println("saldo conta 1: " + c1.saldo);
        
        System.out.println("saldo conta 2: " + c2.saldo);
     
    }
    
}

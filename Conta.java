package conta;

/**
 *
 * @author fnt.3005350077
 */
public class Conta {

  int numero;
  String nome;
  double saldo;
 
boolean saca( double valor){
     if ( this.saldo < valor){
         System.out.println("saldo insuficiente");
         return false;
     } else{
         this.saldo-=valor;
         System.out.println("saque realizado");
         return true;
     }
}
 public void deposita( double valor){
     
     double novoSaldo = this.saldo + valor;
     this.saldo = novoSaldo;
 }
  boolean transfere( Conta destino , double valor){
      boolean retirou = this.saca(valor);
      if(retirou == false){
          System.out.println("saldo insuficiente para tranferencia");
          return false;
      }else{
          destino.deposita(valor);
          
          return true;
      }
  }
  
}

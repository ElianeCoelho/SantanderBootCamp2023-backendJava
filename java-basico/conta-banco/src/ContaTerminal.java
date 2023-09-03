import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

     Scanner sc = new Scanner(System.in);

       int conta;
       String agencia;
       String nomeCliente;
       Double saldo = 237.48;

     System.out.println("Insira Agência"); 
     agencia = sc.nextLine(); 
        
     System.out.println("Isira Conta"); 
     conta = sc.nextInt(); 
    
     System.out.println("Nome do Cliente"); 
     nomeCliente = sc.nextLine();     

      System.out.println("Olá " + nomeCliente + ". Obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + " conta "+ conta+ ", e seu saldo " + saldo + " já está disponível para saque.");
       sc.close();
    }
}

class ContaBancaria{
    private String titular;
    private double saldo;
    
    public ContaBancaria(){
    }
    
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.0;
    }
    
    public void depositar(double deposito){
        if(deposito > 0){
            this.saldo += deposito;
            System.out.println("Depósito realizado com sucesso!");
        }else{
            System.out.println("Não é permitido depositar valores zerados ou negativos!");
        }
    }
    
    public void sacar(double valor){
        if(valor > 0 && saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void exibirSaldo(){
        System.out.println("Nome titular:" + titular);
        System.out.println("Saldo disponível:" + saldo);
    }
}

public class atv2Germini {
    public static void main(String args[]) {
        ContaBancaria caixa = new ContaBancaria("Mauricio"); 
        
        caixa.depositar(55.0);
        caixa.depositar(0);
        caixa.sacar(40.0);
        caixa.sacar(40.0);
        caixa.exibirSaldo();
    
    }
}



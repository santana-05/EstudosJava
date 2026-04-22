class ContaBancaria{
    private String numero;
    private double saldo;
    private String tipo; // Corrente ou poupança
    private String descricao;
    
    public ContaBancaria(String numero, String tipo){
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = 0.0;
    }
    
    public ContaBancaria(String numero, String tipo, double saldoInicial){
        this(numero, tipo);
        if(saldoInicial >= 0){
            this.saldo = saldoInicial;
        }
    }
    
    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Depósito zerado ou negativo!");
            return;
        }
        
        this.saldo += valor;
    }
    
    public void depositar(double valor, String descricao){
        this.depositar(valor);
        this.descricao = descricao;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
}

public class Q1Lista2{
    public static void main(String args[]){
        
    }    
}


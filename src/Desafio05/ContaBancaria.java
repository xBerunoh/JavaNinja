package Desafio05;

public abstract class ContaBancaria implements Conta{
double saldo;
TipoConta tipoConta;

//Construtor `all args`
public ContaBancaria(double saldo){
    this.saldo = saldo;
}

// Métodos
    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual  é:"+saldo);
    }

    // Metodo abstrato
    @Override
    public abstract void depositar(double valor);
}

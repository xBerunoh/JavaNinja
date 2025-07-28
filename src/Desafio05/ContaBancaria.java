package Desafio05;

public abstract class ContaBancaria implements Conta{
double saldo;
TipoConta tipoConta;

//Construtor `all args`
public ContaBancaria(double saldo){
    this.saldo = saldo;
}

    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this(saldo);
        this.tipoConta = tipoConta;
    }

    // Métodos
    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual é: "+saldo);
    }

    // Metodo abstrato
    @Override
    public abstract void depositar(double valor);
}

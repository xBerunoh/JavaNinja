package Desafio05;

public class Main {
    public static void main(String[] args) {
    ContaPoupanca naruto = new ContaPoupanca(0,TipoConta.POUPANCA);
naruto.depositar(5);
naruto.consultarSaldo();

ContaCorrente sasuke = new ContaCorrente(100,TipoConta.CORRENTE);
sasuke.depositar(10);
sasuke.consultarSaldo();


    }
}

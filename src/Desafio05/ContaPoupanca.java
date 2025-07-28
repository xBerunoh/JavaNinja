package Desafio05;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual é: "+saldo);
    }

    @Override
    public void depositar(double valor) {
        double taxa = valor * 1/100;
        System.out.println("Conta POUPANÇA com TAXA de 1%");
        if(valor >= taxa){
            System.out.println("taxa:"+taxa+" R$");
            saldo = saldo + (valor-taxa);

            System.out.println("Valor: "+valor+" R$ depositado, com sucesso !");

        }else {
            System.out.println("Necessario taxa minima de: "+taxa+"$");
        }
    }
}
package Desafio05;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual é: "+saldo);
    }

    @Override
    public void depositar(double valor) {
        if(valor>0){
            saldo= saldo+valor;
            System.out.println("Valor: "+valor+" R$ depositado, com sucesso !");
        }else {
            System.out.println("Você não ta depositando nada !");
        }
    }
}

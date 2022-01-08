package br.com.dio_banco;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("========== Conta Corrente ==========");
        super.imprimirDadosConta();
    }

    public ContaCorrente(Cliente cli) {
        super(cli);
    }

}

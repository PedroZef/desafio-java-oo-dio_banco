package br.com.dio_banco;

public class MainBanco {

    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.setNome("Cliente Pedro Zeferino");
        c.setCpf(00333333333);

        Conta cc = new ContaCorrente(c);
        cc.depositar(200);

        Conta cp = new ContaPoupanca(c);
        cp.depositar(150);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println("Tranferindo R$ 100 para a conta poupança...");

        cc.transferir(80, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        }

    }


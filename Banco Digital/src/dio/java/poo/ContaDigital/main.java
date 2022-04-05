package dio.java.poo.ContaDigital;

public class main {
    public static void main(String[] args) {

        Cliente lucas = new Cliente();
        lucas.setNome("Lucas Ramalho");

        Conta cc = new ContaCorrente(lucas);
        Conta poupanca = new ContaPoupanca(lucas);

        cc.transferir(80, poupanca);
        cc.depositar(100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

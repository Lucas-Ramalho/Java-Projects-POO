package dio.java.poo.ContaDigital;

/*
    - usar uma interface torna mais elegante a implementacao, definir um contrato de conta
    interface é uma classe abstrata com todos os métodos abstratos é uma classe que
    obriga a todos as classes que a estende tem q implementar, como um contrato
    difinindo que todas as contas tem que ter os métodos sacar, depositar,
    transferir por exemplo

    - uma interface não precisa colocar public, é uma redundanca

 */

public interface InterfaceConta {

    // métodos da conta

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, InterfaceConta contaDestino);

    void imprimirExtrato();
}

package dio.java.poo.ContaDigital;

// super classe, classe pai
public abstract class Conta implements InterfaceConta {

    // dando valores para as contas, fixo para agencia e sequencial para as contas
    private static final int AGENCIA_PADRAO = 1;
    private  static int SEQUENCIAL = 1;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


    // atributos da conta
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    // implementando as classes abstratas criadas
    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, InterfaceConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }




    // definindo o get - não faz sentido alguem de fora mudar a agencia, conta, saldo (set)

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


}


package dio.java.poo.ContaDigital;

import java.util.List;

public class Banco {

    // atributos do banco
    private String nome;
    private List<Conta> conta;



    // Criando getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


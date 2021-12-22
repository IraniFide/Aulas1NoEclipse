package aulasDoSenai;

public class Cliente {

    private int agencia;
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;    }


    private int conta;
    public int getConta() {
        return conta;
    }

    private String cpf;
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private String nascimento;
    public String getNascimento() {
        return nascimento;
    }
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    private float saldo ;
    public float getSaldo() {
        return saldo;
    }
    private String senha ;
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    private String endereco ;
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {   this.endereco = endereco;    }
    private String telefone ;
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


};



package aulasDoSenai;
import java.util.Scanner;
import java.util.Date;

public class Executar {

    public static void main (String[] args){
//      instânciar é copiar quando pego a classe transformo em obj
//      nome da CLASSE escolho um nome que vira obj = new CLASSE() os parenteses significa construtor

        Scanner teclado = new Scanner(System.in); // criando objeto para inseri valor atraves do teclado
       // teclado.nextLine();

//        dataAbertura = new java.util.Date();

        Cliente pessoa = new Cliente();
//        pessoa.mostrarCliente();

        pessoa.setAgencia(100);
        pessoa.setConta(34567);
        pessoa.setCpf("123.456.789.90");
        pessoa.setNome("Irani Fidelis");
        pessoa.setNascimento("15/06/1995");
        pessoa.setTelefone("(11)9152-456");
        pessoa.setEndereco("Av dos Autonomista 500");
        pessoa.setSaldo(1000.00f);
        pessoa.setSenha("abc@12345");

        System.out.println("     Dados do Cliente   ");
        System.out.println("Agência "  +pessoa.getAgencia());
        System.out.println("Conta:"  +pessoa.getConta());
        System.out.println("CPF "  +pessoa.getCpf());
        System.out.println("Nome "  +pessoa.getNome());
        System.out.println("Nascimento "  +pessoa.getNascimento());
        System.out.println("Telefone "  +pessoa.getTelefone());
        System.out.println("Saldo R$"  +pessoa.getSaldo());
        System.out.println("Senha "  +pessoa.getSenha());

        ContaCorrente correntista = new ContaCorrente();

        correntista.setNumero_doc_cc(23456789);    //set para colocar e get para pegar
        correntista.setAgencia_cc(100);
        correntista.setConta_cc(34567);
        correntista.setValor_cc(50.00f);
        correntista.setTipo_cc(1);
        correntista.setDataOcorrencia_cc("20/10/2021");
        correntista.setSaldo_cc(1050.00f);

//        System.out.println("Digite agencia"); Junto com o comando "Scanner teclado = new Scanner(System.in)"
//        dessa forma ele pede para digitarmos o que está sendo pedido
//        correntista.setAgencia_cc(teclado.nextInt()); tem outros jeito de fazer essa parte


        System.out.println(" ");
        System.out.println("    Dados da Conta Corrente    ");
        System.out.println("Agência " +correntista.getAgencia_cc());
        System.out.println("Numero do documento: "+correntista.getNumero_doc_cc());
        System.out.println("Numero da Conta Corrente: "+correntista.getConta_cc());
        System.out.println("Valor do depósito foi de:R$" +correntista.getValor_cc());
        System.out.println("Codigo do Depósito: "+correntista.getTipo_cc());
        System.out.println("Data da ocorrência: "+correntista.getDataOcorrencia_cc());
        System.out.println("Saldo em conta: R$" +correntista.getSaldo_cc());
    }

}

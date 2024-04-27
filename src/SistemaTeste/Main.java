package SistemaTeste;

public class Main {
    public static void main(String[] args) {
        Banco bancopan = new Banco();
        Loja lojaMarisa = new Loja(0);
        Loja lojaRachu = new Loja(0);

        Funcionario funcionariopedro = new Funcionario("funcionario pedro", 1400);
        Funcionario funcionariomaria = new Funcionario("funcionario maria", 1400);
        Funcionario funcionariodiogo = new Funcionario("funcionariodiogo", 1400);
        Funcionario funcionariomichelle = new Funcionario("funcionariomichelle", 1400);

        Cliente clientemarcos = new Cliente("Cliente marcos", 1000);
        Cliente clientemario = new Cliente("Cliente mario", 1000);
        Cliente clientemaria = new Cliente("Cliente maria", 1000);
        Cliente clientejoao = new Cliente("Cliente joao", 1000);
        Cliente clientetiago = new Cliente("Cliente tiago", 1000);

        funcionariopedro.start();
        funcionariomaria.start();
        funcionariodiogo.start();
        funcionariomichelle.start();

        clientemarcos.start();
        clientemario.start();
        clientemaria.start();
        clientejoao.start();
        clientetiago.start();
    }
}
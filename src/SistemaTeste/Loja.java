package SistemaTeste;

class Loja {
    private Conta conta;
    private double saldoFuncionarios;

    public Loja(double saldoInicialFuncionarios) {
        this.conta = new Conta("Loja", 0); 
        this.saldoFuncionarios = saldoInicialFuncionarios;
    }

    public Conta getConta() {
        return conta;
    }

    public void pagarFuncionario(Conta contaFuncionario, double salario) {
        synchronized (contaFuncionario) {
            if (saldoFuncionarios >= salario) {
                contaFuncionario.creditar(salario);
                saldoFuncionarios -= salario;
                System.out.println("Funcionário pago: " + contaFuncionario.getCliente());
            } else {
                System.out.println("Saldo insuficiente para pagar funcionário: " + contaFuncionario.getCliente());
            }
        }
    }
}
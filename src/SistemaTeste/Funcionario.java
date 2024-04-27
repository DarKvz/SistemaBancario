package SistemaTeste;

class Funcionario extends Thread {
    private Conta contadoSalario;
    private Conta contadeInvestimento;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.contadoSalario = new Conta(nome, 0);
        this.contadeInvestimento = new Conta(nome + " - Investimento", 0);
        this.salario = salario;
    }

    public Conta getContaSalario() {
        return contadoSalario;
    }

    public Conta getContaInvestimento() {
        return contadeInvestimento;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void run() {
        synchronized (contadoSalario) {
            contadoSalario.creditar(salario);
            double valorInvestimento = salario * 0.2;
            contadoSalario.debitar(valorInvestimento);
            contadeInvestimento.creditar(valorInvestimento);
            System.out.println("Salario recebido por " + contadoSalario.getCliente() + ": R$ " + salario);
            System.out.println("Valor investido por " + contadoSalario.getCliente() + ": R$ " + valorInvestimento);
        }
    }
}
package SistemaTeste;

class Cliente extends Thread {
    private Conta conta;

    public Cliente(String nome, double ValorInicial) {
        this.conta = new Conta(nome, ValorInicial);
    }

    public Conta getConta() {
        return conta;
    }

    @Override
    public void run() {
        while (conta.getSaldo() > 0) {
           
        }
    }
}
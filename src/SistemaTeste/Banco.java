package SistemaTeste;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class Banco {
    private Lock lock = new ReentrantLock();

    public void transferir(Conta origem, Conta destino, double valor) {
        lock.lock();
        try {
            if (origem.getSaldo() >= valor) {
                origem.debitar(valor);
                destino.creditar(valor);
                System.out.println("Transferencia de R$ " + valor + " realizada de " + origem.getCliente() +
                        " para " + destino.getCliente());
                System.out.println("Saldo de " + origem.getCliente() + ": R$ " + origem.getSaldo());
                System.out.println("Saldo de " + destino.getCliente() + ": R$ " + destino.getSaldo());
            } else {
                System.out.println("valor insuficiente para transferencia " + origem.getCliente());
            }
        } finally {
            lock.unlock();
        }
    }
}
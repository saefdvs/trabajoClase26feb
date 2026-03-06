package org.example;

public class Cuenta {

    private double saldo;

    // constructor 1: cuenta empezada en 0
    public Cuenta() {
        this.saldo = 0;
    }

    // constructor 2: cuenta con saldo inicial
    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // depositar dinero
    public void depositar(double monto) {
        saldo = saldo + monto;
        System.out.println("Depósito exitoso. Depositaste: $" + monto);
    }

    // retirar dinero
    public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Saldo insuficiente. Te recomendamos consultar tu saldo.");
        } else {
            saldo = saldo - monto;
            System.out.println("Retiro exitoso. Retiraste: $" + monto);
        }
    }

    // consultar saldo
    public double getSaldo() {
        return saldo;
    }
}
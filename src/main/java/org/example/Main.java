package org.example;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // creamos el objeto Scanner para leer lo que el usuario escribe
        Scanner scanner = new Scanner(System.in);

        // le preguntamos al usuario con cuánto dinero quiere abrir la cuenta
        System.out.println("¿Con cuánto dinero desea abrir su cuenta? escriba 0 si no tiene");
        double montoInicial = scanner.nextDouble();

        Cuenta miCuenta;

        // si el usuario escribe 0, se crea la cuenta sin saldo inicial, si escribe otro valor se crea con ese valor
        if (montoInicial == 0) {
            miCuenta = new Cuenta();
        } else {
            miCuenta = new Cuenta(montoInicial);
        }

        // variable que guarda la opción elegida por el usuario en el menú
        int opcion = 0;

        // el menú se repite hasta que el usuario elija la opción 4 (Salir)
        while (opcion != 4) {

            // estas son las opciones disponibles que tiene el usuario
            System.out.println("\n---- BANCO EL AHORRADOR ----");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Ver saldo");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            // switch que ejecuta el caso segun opcion elegida
            switch (opcion) {

                case 1:
                    // opción 1: el usuario deposita dinero
                    System.out.print("¿Cuánto desea depositar? $");
                    double montoDeposito = scanner.nextDouble();
                    miCuenta.depositar(montoDeposito);
                    break;

                case 2:
                    // ppción 2: el usuario retira dinero
                    System.out.print("¿Cuánto dinero desea retirar? $");
                    double montoRetiro = scanner.nextDouble();
                    miCuenta.retirar(montoRetiro);
                    break;

                case 3:
                    // opción 3: se muestra el saldo actual
                    System.out.println("Su saldo actual es: $" + miCuenta.getSaldo());
                    break;

                case 4:
                    // opción 4: el usuario sale del programa
                    System.out.println("Gracias por usar el cajero de su Banco Ahorrador");
                    break;

                default:
                    // el usuario escribio una opcion que no existe
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
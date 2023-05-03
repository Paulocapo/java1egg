/*
 a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class CuentaBancariaServicio {

    public CuentaBancaria crearCuenta() {
        int numeroCuenta;
        int dniCliente;
        double saldoActual;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese numero de cuenta: ");
        numeroCuenta = leer.nextInt();
        System.out.println("Ingrese dni del cliente: ");
        dniCliente = leer.nextInt();
        System.out.println("Ingrese saldo de la cuenta: ");
        saldoActual = leer.nextDouble();

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public void ingresar(CuentaBancaria numeroCuenta, double saldo) {
        numeroCuenta.setSaldoActual(numeroCuenta.getSaldoActual() + saldo);

    }

    public double retirar(CuentaBancaria numeroCuenta, double saldo) {

        double balance = numeroCuenta.getSaldoActual();

        if (saldo <= balance) {
            numeroCuenta.setSaldoActual(balance - saldo);
        } else {
            saldo = balance;
            numeroCuenta.setSaldoActual(0);
        }
        return saldo;
    }

    public double extraccionRapida(CuentaBancaria numeroCuenta, double saldo) {

        double balance = numeroCuenta.getSaldoActual();

        if (saldo >= balance * 0.2) {
            saldo = balance * 0.2;
            numeroCuenta.setSaldoActual(balance * 0.8);
        } else {
            numeroCuenta.setSaldoActual(balance - saldo);
        }

        return saldo;
    }

    public void consultarSaldo(CuentaBancaria numeroCuenta) {

        System.out.printf(" El saldoes  %d: %.4f", numeroCuenta.getNumeroCuenta(),
                numeroCuenta.getSaldoActual());

    }

    public void consultarDatos(CuentaBancaria numeroCuenta) {
        System.out.printf("Datos de la cuenta %d:\n"
                + "DNI del cliente: %d\n"
                + "Saldo de la cuenta: %.4f\n\n",
                numeroCuenta.getNumeroCuenta(), numeroCuenta.getDniCliente(),
                 numeroCuenta.getSaldoActual());
    }
}

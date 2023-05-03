/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package guia7extrasejercicio4;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class Cuenta {

    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirar_dinero() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String seguir = "s";
        do {

            System.out.println("Hola " + this.titular);
            System.out.println("Ingrese la cantidad de dinero que desea retirar: ");
            double dineroaRetirar = leer.nextInt();
            if (this.saldo >= dineroaRetirar) {
                this.saldo = this.saldo - dineroaRetirar;
                System.out.println("Se retiró " + dineroaRetirar);
                System.out.println("Su saldo actual es de " + this.saldo);
            } else {
                System.out.println("su saldo es:" + this.saldo + " No puede retirar ese importe");
            }
            if (this.saldo > 0) {
                System.out.println(" Desea seguir retirando dinero s/n : ");
                seguir = leer.next().toLowerCase();
            } else {
                seguir = "n";
            }

        } while (seguir.equals("s")&& this.saldo>0);
    }
}

package Clase3;

import java.util.Scanner;

public class Metodos21 {
    //Realizar un método llamado calcularPromedio, que solicite el ingreso de números hasta que se ingrese 0, y que calcule el promedio de los mismos.
    // Se debe utilizar el método ingresarNumero.

    public static void main(String[] args) {
        calcularPromedio();
    }

    public static int ingresarNumero(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        return num;
    }

    public static void calcularPromedio(){
        int suma = 0;
        int count = 0;
        int num = ingresarNumero();

        while ( num != 0){
            suma = suma+num;
            count++;
            num = ingresarNumero();
        }

        System.out.println("El promedio de todos los numeros ingresados es: " + suma/count);
    }
}

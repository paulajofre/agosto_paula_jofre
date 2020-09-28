package Clase7.Ejercicio3;

import java.util.Scanner;

public class miVehiculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Pedir datos del auto
        System.out.println("Ingrese la velocidad maxima del auto");
        int velocidadAuto = input.nextInt();
        System.out.println("Ingrese las cilindradas del auto");
        String cilindradasAuto = input.next();

        //Crear auto
        Auto auto1 = new Auto(velocidadAuto, cilindradasAuto);

        //Mostrar auto
        System.out.println(auto1);

        //Pedir datos de las motos
        System.out.println("Ingrese la velocidad maxima de la primer moto");
        int velocidadMoto1 = input.nextInt();
        System.out.println("Ingrese las cilindradas de la primer moto");
        String cilindradasMoto1 = input.next();
        System.out.println("Ingrese la velocidad maxima de la segunda moto");
        int velocidadMoto2 = input.nextInt();
        System.out.println("Ingrese las cilindradas de la segunda moto");
        String cilindradasMoto2 = input.next();

        //Crear motos
        Moto moto1 = new Moto(velocidadMoto1, cilindradasMoto1);
        Moto moto2 = new Moto(velocidadMoto2, cilindradasMoto2);

        //Mostrar motos
        System.out.println(moto1);
        System.out.println(moto2);

        //Pedir datos del semiremolque
        System.out.println("Ingrese la cantidad de ejes");
        int ejes = input.nextInt();

        //Crear semiremolque
        Semiremolque semi1 = new Semiremolque(ejes);

        //Mostrar semiremolque
        System.out.println(semi1);
    }
}

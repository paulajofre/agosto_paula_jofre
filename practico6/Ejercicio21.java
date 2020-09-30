package Clase6;

public class Ejercicio21 {
    public static void main(String[] args) {
        int arregloDeEnteros[] = new int[5];
        arregloDeEnteros[0] = -1;
        arregloDeEnteros[1] = 0;
        arregloDeEnteros[2] = 10;
        arregloDeEnteros[3] = 2;
        arregloDeEnteros[4] = -3;

        ejercicio20(arregloDeEnteros);
    }

    public static void ejercicio20(int[] args){
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for(int i=0; i<args.length; i++){
            if(args[i] == 0){
                ceros++;
            }
            else if(args[i] > 0){
                positivos++;
            }
            else {
                negativos++;
            }
        }
        System.out.println("La cantidad de numeros positivos es: " + positivos);
        System.out.println("La cantidad de numeros negativos es: " + negativos);
        System.out.println("La cantidad de ceros: " + ceros);
    }
}

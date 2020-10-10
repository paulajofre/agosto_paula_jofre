package Clase6;

public class Ejercicio20 {
    public static void main(String[] args) {
        boolean arregloDeBooleans[] = new boolean[9];
        arregloDeBooleans[0] = true;
        arregloDeBooleans[1] = true;
        arregloDeBooleans[2] = true;
        arregloDeBooleans[3] = true;
        arregloDeBooleans[4] = true;
        arregloDeBooleans[5] = true;
        arregloDeBooleans[6] = true;
        arregloDeBooleans[7] = true;
        arregloDeBooleans[8] = true;

        ejercicio20(arregloDeBooleans);
    }

    public static void ejercicio20(boolean[] args){
        int falsos = 0;
        for(int i=0; i<args.length; i++){
            if(args[i] != true){
                falsos++;
            }
        }
        if(falsos==0){
            System.out.println("Todos los elementos son true");
        }
    }
}

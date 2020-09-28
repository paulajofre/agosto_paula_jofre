package Clase7.Ejercicio3;

public class Auto extends Vehiculo{
    private int veocidadMaxima;
    private String cilindradas;

    public void setVeocidadMaxima(int unaVelocidad){
        this.veocidadMaxima = unaVelocidad;
    }
    public int getVeocidadMaxima(){
        return veocidadMaxima;
    }

    public void setCilindradas(String unaCilindrada){
        this.cilindradas = unaCilindrada;
    }
    public String getCilindradas(){
        return cilindradas;
    }

    public Auto(){
        this.veocidadMaxima = 0;
        this.cilindradas = "desconocidas";
    }

    public Auto(int velocidad, String cilindradas){
        this.veocidadMaxima = velocidad;
        this.cilindradas = cilindradas;
    }

    public String toString() {
        String texto = "El auto es de " + this.cilindradas + " cilindradas y su velocidad maxima es " + this.veocidadMaxima;
        return texto;
    }
}

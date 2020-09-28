package Clase7.Ejercicio3;

public class Semiremolque extends Vehiculo{
    private int cantidadEjes;

    public void setCantidadEjes(int unaCantidad){
        this.cantidadEjes = unaCantidad;
    }
    public int getCantidadEjes(){
        return cantidadEjes;
    }

    public Semiremolque(){
        this.cantidadEjes = 0;
    }

    public Semiremolque(int ejes){
        this.cantidadEjes = ejes;
    }

    public String toString() {
        String texto = "El semiremolque tiene " + this.cantidadEjes + " ejes.";
        return texto;
    }
}

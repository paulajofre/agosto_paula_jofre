package Clase7.Ejercicio3;

public class Vehiculo {

    private String ruedas;
    private String color;

    public void setRuedas(String unaRueda){
        this.ruedas = unaRueda;
    }
    public String getRuedas(){
        return ruedas;
    }

    public void setColor(String unColor){
        this.ruedas = unColor;
    }
    public String getColor(){
        return color;
    }

    public Vehiculo(){
        this.ruedas = "desconocido";
        this.color = "color no ingresado";
    }

    public Vehiculo(String ruedas, String color){
        this.ruedas = ruedas;
        this.color = color;
    }

    public String toString() {
        String texto = "El color del vehiculo es " + this.color + " y las ruedas son " + this.ruedas;
        return texto;
    }
}

package Clase5.Ejercicio3;

public class Libro {

    //Atributos
    private int ISBN;
    private String titulo;
    private String autor;
    private  int noPaginas;

    //Getters y Setters
    public void setISBN(int unISBN){
        this.ISBN = unISBN;
    }
    public int getISBN(){
        return ISBN;
    }

    public void setTitulo(String unTitulo){
        this.titulo = unTitulo;
    }
    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String unAutor){
        this.autor = unAutor;
    }
    public String getAutor(){
        return autor;
    }

    public void setNoPaginas(int unNumero){
        this.noPaginas = unNumero;
    }
    public int getNoPaginas(){
        return noPaginas;
    }

    //Constructor default
    public Libro(){
        this.ISBN = 0;
        this.titulo = "Sin titulo";
        this.autor = null;
        this.noPaginas = 0;
    }

    //Constructor con parametros
    public Libro(int unISBN, String unTitulo, String unAutor, int unNoPaginas){
        this.ISBN = unISBN;
        this.autor = unAutor;
        this.titulo = unTitulo;
        this.noPaginas = unNoPaginas;
    }


    //Metodo To String
    public String toString() {
        String texto;
        if(autor == null || autor.equals("")){
            texto = "El libro con ISBN " + ISBN + ", creado por el autor desconocido tiene " + noPaginas + " paginas. ";
        }
        else {
            texto = "El libro con ISBN " + ISBN + ", creado por el autor: " + autor + " tiene " + noPaginas + " paginas. ";
        }
        return texto;
    }
}

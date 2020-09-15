package Clase5.Ejercicio3;

import java.util.Scanner;

public class Libreria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Libro1
        Libro libro1 = new Libro();
        System.out.println("Ingrese un ISBN: ");
        int ISBN = input.nextInt();
        System.out.println("Ingrese un titulo: ");
        String titulo = input.next();
        System.out.println("Ingrese el numero de paginas: ");
        int noPaginas = input.nextInt();
        System.out.println("Ingrese un autor: ");
        String autor = input.next();


        libro1.setISBN(ISBN);
        libro1.setTitulo(titulo);
        libro1.setAutor(autor);
        libro1.setNoPaginas(noPaginas);

        System.out.println(libro1);

        //Libro2
        Libro libro2 = new Libro();
        System.out.println(libro2);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;


public class Main {

    public static void main(String[] args) {
        
       CLibro libro1;
        libro1 = new CLibro("El Quijote", "Miguel de Cervantes", 10, 2);
    }
}

/**
 * 
 * clase CLibro, proporciona el autor, ejemplar, prestados, titulo.
 * Nos proporciona la cantidad de libros prestados, libros devueltos  y muestra por pantalla
 */

    public class CLibro {
        
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

/**
 * Getters y setters 
 * @return titulo, autor, ejemplares y prestados
 */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
   

    public CLibro() {
    }

    public CLibro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }
/**
 * 
 * @param cantidad
 * @return true si hay ejemplares para prestarte
 * @return false si no hay ejemplares para prestarte
 */
    public boolean prestar(int cantidad) {
        if ((prestados + cantidad) <= ejemplares) {
            prestados = prestados + cantidad;
            return true;
        } else {
            return false;
        }
    }

    /**
     * 
     * @param cantidad
     * @return true si puedo devolver algun libro
     * @return false si no puedo devolver ningun libro
     */
    public boolean devolver(int cantidad) {
        if ((prestados - cantidad) >= 0) {
            prestados = prestados - cantidad;
            return true;
        } else {
            return false;
        }
    }
    
public void operativa_libro(int cantidad){
    

        libro1.mostrarEstado();
        libro1.prestar(2);
        libro1.devolver(1);
        libro1.mostrarEstado(); 
}

    public void mostrarEstado() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ejemplares: " + ejemplares);
        System.out.println("Prestados: " + prestados);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 * 
 * crea un nuevo libro con su informacion
 */
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
 * metodo prestar libros
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
     * metodo devuelve libros 
     * @param cantidad de libros 
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
    /**
     * muestra las operaciones de libro1
     * @param cantidad de libros que voy poner en cada metodo
     */
public void operativa_libro(int cantidad){
    

        libro1.mostrarEstado();
        libro1.prestar(2);
        libro1.devolver(1);
        libro1.mostrarEstado(); 
}
/**
 * muestra el estado del titulo, autor, ejemplares y prestados
 */
    public void mostrarEstado() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ejemplares: " + ejemplares);
        System.out.println("Prestados: " + prestados);
    }
}


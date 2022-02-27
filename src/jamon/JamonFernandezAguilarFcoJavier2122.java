/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jamon;

/**
 *Clase Jamon donde se crean los metodos y variables
 * que usa la clase Main
 * 
 * @author Javier
 */
public class JamonFernandezAguilarFcoJavier2122 {

    
    private String categoria;
    private double precio;
    private int mesesCuracion;
    private int stock;
    
    
    /**
     * Metodo que devuelve la categoria del jamon
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Metodo que establece la categoria del jamon
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Metodo que devuelve el precio del jamon
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo que establece el precio del jamon
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * 
     * Metodo que devuelve lo meses que lleva el jamon en curacion
     * @return the mesesCuracion
     */
    public int getMesesCuracion() {
        return mesesCuracion;
    }

    /**
     * Metodo que inidica lo meses que lleva el jamon en curacion
     * @param mesesCuracion the mesesCuracion to set
     */
    public void setMesesCuracion(int mesesCuracion) {
        this.mesesCuracion = mesesCuracion;
    }

    /**
     * Devuelve el stock que queda
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Indicamos que stock hay
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    

    /* Constructor sin argumentos */
    public JamonFernandezAguilarFcoJavier2122 ()
    {
    }
    
    /*Constructor por parámetros*/
    public JamonFernandezAguilarFcoJavier2122 (String cat, double precio, int stock)
    {
        this.categoria =cat;
        this.precio=precio;
        this.stock=stock;
    }
    
    
   /** Método para asignar la categoría del jamón*/
    public void asignarCategoria(String cat)
    {
        setCategoria(cat);
    }
    /** Método que me devuelve la categoría del jamón*/
    public String obtenerCategoria()
    {
        return getCategoria();
    }

    /** 
     * Método que me devuelve el stock de jamones disponible en cada momento
     * @return 
     */
     public int obtenerStock ()
    {
        return getStock();
    }

    /* Método  para comprar tiene que ser un numero mayor a 0
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de jamones");
        setStock(getStock() + cantidad);
    }

    /**
     * 
     * Metodo venta no puede ser una cantidad negativa y tiene que haber suficientes jamones en stock
     * 
     */
    public void vender (int cantidad, String paisFernandezAguilarFcoJavier2122) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de jamones");
        if (obtenerStock()< cantidad)
            throw new Exception ("No  hay suficientes jamones para vender");
        setStock(getStock() - cantidad);
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamon;

/**
 *
 * @author portatil_profesorado
 */
public class Main {
    
    public static void main(String[] args) {
        JamonFernandezAguilarFcoJavier2122 miJamonFernandezAguilarFcoJavier2122;
        int stockActual;
        
        miJamonFernandezAguilarFcoJavier2122 = new JamonFernandezAguilarFcoJavier2122("5Jotas",580,100);
        vendeJamFernandezAguilarFcoJavier2122(miJamonFernandezAguilarFcoJavier2122);
        
        compraJamFernandezAguilarFcoJavier2122(miJamonFernandezAguilarFcoJavier2122);
    }

    public static void compraJamFernandezAguilarFcoJavier2122(JamonFernandezAguilarFcoJavier2122 miJamonFernandezAguilarFcoJavier2122) {
        int stockActual;
        try
        {
            System.out.println("Compra de Jamones");
            miJamonFernandezAguilarFcoJavier2122.comprar(50);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
        stockActual = miJamonFernandezAguilarFcoJavier2122.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    public static void vendeJamFernandezAguilarFcoJavier2122(JamonFernandezAguilarFcoJavier2122 miJamonFernandezAguilarFcoJavier2122) {
        try
        {
            System.out.println("Venta de Jamones");
            miJamonFernandezAguilarFcoJavier2122.vender(80, "España");
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
    }
}

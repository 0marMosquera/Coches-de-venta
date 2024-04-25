/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coches;

/**
 *
 * @author Omar Reinaldo
 */
public class Coches {

    /**
     * Atributos
     */
    private String marca;
    private String modelo;
    private int añoDeMatricula;
    private boolean electrico;
    
    /**
     * Constructor
     * @param args 
     */
    
    public Coches(String marca, String modelo, int añoDeMatricula, boolean electrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoDeMatricula = añoDeMatricula;
        this.electrico = electrico;
        // TODO code application logic here
    }

    
    public String getMarca() {
        return marca;
        // TODO code application logic here
    }

    public String getModelo() {
        return modelo;
    }

    public int getAñoDeMatricula() {
        return añoDeMatricula;
    }

    /**
     * Metodos
     * @param args 
     */
    public boolean isElectrico() {    
        return electrico;
    }

    public static void main(String[] args) {
        // crear el objecto coche1
        Coches coche1=new Coches("Toyota", "Rava 2023", 2024, true);
        System.out.println("Datos del coche1");
        System.out.println("marca->"+coche1.getMarca());
        System.out.println("modelo->"+coche1.getModelo());
        System.out.println("año de matricula->"+coche1.getAñoDeMatricula());
        System.out.println("electrico: "+coche1.electrico);
        System.out.println("\n");
        
        Coches coche2=new Coches("Nissan", "Sentra", 2023, true);
        System.out.println("Datos del coche2");
        System.out.println("marca->"+coche2.getMarca());
        System.out.println("modelo->"+coche2.getModelo());
        System.out.println("año de matricula->"+coche2.getAñoDeMatricula());
        System.out.println("electrico: "+coche2.electrico);
        System.out.println("\n");
         
        Coches coche3=new Coches("Suzuki", "Baleno", 2024, true);
        System.out.println("Datos del coche3");
        System.out.println("marca->"+coche3.getMarca());
        System.out.println("modelo->"+coche3.getModelo());
        System.out.println("año de matricula->"+coche3.getAñoDeMatricula());
        System.out.println("electrico: "+coche3.electrico);
        System.out.println("\n");
        
        Coches coche4=new Coches("Mazda", "Cz-30", 2021, true);
        System.out.println("Datos del coche4");
        System.out.println("marca->"+coche4.getMarca());
        System.out.println("modelo->"+coche4.getModelo());
        System.out.println("año de matricula->"+coche4.getAñoDeMatricula());
        System.out.println("electrico: "+coche4.electrico);
        
    }
    
}

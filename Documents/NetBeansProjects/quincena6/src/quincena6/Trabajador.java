/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quincena6;

/**
 * Esta clase se utiliza para añadir un trabajador teniendo como clase padre a "Persona".
 * @author Alexandru Ban
 * @version 1
 */
public class Trabajador extends Persona {
    //Variable que guardara el numero de la seguridad social.
    private String SegSocial;

    //GETTER
    
    /**
     * Este getter muestra por pantalla el numero de seguridad social.
     * @return this.SegSocial. Devuelve el valor de Seguridad Social.
     */
    public String getSegsocial() {return this.SegSocial;};
    
    //SETTER
    
    /**
     * Este setter permite añadir al usuario un numero de seguridad social.
     * @param nuevaSeg. 
     */
    
    public void setSeg(String nuevaSeg){
        
        this.SegSocial = nuevaSeg;
    }
    
    //CONSTRUCTOR
    /**
     * Este constructor crea un objeto del tipo trabajador y que tiene de herencia la clase persona, es decir, el trabajador es una persona.
     * @param nombre En este parametro se introduce el nombre del trabajador.
     * @param apellidos En este parametro se introducen los apellidos del trabajador.
     * @param dni En este parametro se introduce el dni del trabajador.
     * @param edad En este parametro se introduce la edad del trabajador.
     * @param segSocial En este parametro se introduce el numero de la Seguridad Social del trabajador.
     */
    
    public Trabajador(String nombre, String apellidos, String dni, int edad, String segSocial) {
       super(nombre, apellidos, dni, edad);
         this.SegSocial = segSocial;
    }
    //FIN DEL CONSTRUCTOR
}

//FIN DE LA CLASE

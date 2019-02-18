/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quincena6;
import java.util.*;

/**
 *Clase Principal del proyecto donde su funcion es sacar el anyo de nacimiento a partir de una edad.
 * @author Alexandru Ban
 * @version 2
 */
public class Quincena6 {

    public static void main(String[] args) {
       //Clases Persona para las diferentes soluciones.
        Persona pers;
        Persona pers2;
        
       
        
        //Scanners
        Scanner teclado = new Scanner(System.in); //Este scanner es para el anyo actual.
        Scanner tec = new Scanner(System.in); //Este scanner es para la pers2, ya que daba un bug si se utilizaba el scanner teclado.
        
        //Anyo actual para las clases pers y pers1.
        int anyo;
        
        System.out.println("Dime el anyo actual: ");
        anyo = teclado.nextInt();
        
        //Variables que necesitamos para el ejercicio.
        int solucion, solucion1, solucion2;
        
        //Nuevo comentario para el GitHub.
        
        
        
        //Primera solucion.
        
        /**
         * Creamos el objeto pers y lo rellenamos con los datos que nos pide la practica.
         */
        
        //Constructor de la primera persona.
        
        pers = new Persona("Pepa", "Garcia Navarro", "44879652L", 21);
        
        solucion = pers.dameAnyoNacimiento(anyo);
        
        //AQUI SE MUESTRA EN PANTALLA LA SOLUCION.
        
        System.out.println("La persona " + pers.getApellidos() + ", " + pers.getNombre() + " con dni " + pers.getDni() + " ha nacido en el año " + solucion);
        
        //Segunda Solucion.
        
        /**
         * Creamos el objeto pers2 y rellenamos sus atributos con los datos que pide la practica.
         */
        pers2 = new Persona("Lumilda Maria", "Perez Gimenez", "21979552WL", 41);
        
        
        solucion1 = pers2.dameAnyoNacimiento(anyo);
        
        //AQUI SE MUESTRA EN PANTALLA LA SOLUCION.
         System.out.println("La persona " + pers2.getApellidos() + ", " + pers2.getNombre() + " con dni " + pers2.getDni() + " ha nacido en el año " + solucion1);
         
          //Tercera Solucion.
          
          /**
           * Creamos el objeto pers3 que sera rellenado con un Scanner.
           */
          
          //CREAMOS LAS VARIABLES PARA RELLENARLAS EN EL CONSTRUCTOR.
        String nombre, apellidos, dni, segSocial;
        int edad;
         
        //SCANNER PARA INTRODUCIR LOS DATOS.
         System.out.println("Introduce tu nombre: ");
            nombre = tec.nextLine();
         
         System.out.println("Introduce tus apellidos: ");
        apellidos = tec.nextLine();
         
         System.out.println("Introduce tu DNI: ");
         dni = tec.nextLine();
         
         System.out.println("Introduce tu edad: ");
        edad = tec.nextInt();
         
         System.out.println("Introduce tu numero de Seguridad Socia: ");
        segSocial = tec.nextLine();
        //FIN DEL SCANNER
        
        //Creamos el constructor con las variables del Scanner para rellenarlo.
        Trabajador pers3;
        pers3 = new Trabajador(nombre,apellidos,dni,edad,segSocial);
         
         //Finalmente aplicamos la solucion
         solucion2= pers3.dameAnyoNacimiento(anyo);
         
         //AQUI SE MUESTRA EN PANTALLA LA SOLUCION.
         
         System.out.println("La persona " + pers3.getApellidos() + ", " + pers3.getNombre() + " con dni " + pers3.getDni() + " y numero de Seguridad Social: " + pers3.getSegsocial() + " ha nacido en el año " + solucion2);
         
         
        
    }
    
}

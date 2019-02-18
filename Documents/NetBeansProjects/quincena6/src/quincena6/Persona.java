/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quincena6;

/**
 * Esta clase se ocupa de generar informacion sobre una persona ademas de sacar el anyo de nacimiento.
 * @author Alexandru Ban
 * @version 1
 */
public class Persona{
    
    //ATRIBUTOS DE LA CLASE PERSONA
    
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    
    //INICIO DE LOS GETTERS
    
    /**
     * Este Getter muestra por pantalla el nombre.
     * @return this.nombre Devuelve el nombre.
     */
    public String getNombre(){return this.nombre;}
    
    /**
     * Este Getter muestra por pantalla los apellidos.
     * @return this.apellidos Devuelve los apellidos.
     */
    public String getApellidos(){return this.apellidos;}
    
    /**
     * Este Getter muestra por pantalla el DNI.
     * @return this.dni Devuelve el DNI.
     */
    public String getDni(){return this.dni;}
    
    /**
     * Este Getter muestra por pantalla la edad.
     * @return this.edad Devuelve la edad.
     */
    public int getEdad(){return this.edad;}
    
    //FIN DE LOS GETTERS.
    
    //INICIO DE LOS SETTERS
    
    /**
     * Este Setter permite editar el atributo de nombre.
     * @param nuevoNombre En este parametro se guardara el valor del nombre.
     */
    
    public void setNombre(String nuevoNombre){
        
        this.nombre = nuevoNombre;   
    }
    
    /**
     * Este Setter permite editar el atributo de apellidos.
     * @param nuevoApellido En este parametro se guardaran los apellidos.
     */
    
    public void setApellidos(String nuevoApellido){
        
        this.apellidos = nuevoApellido;
    }
    
    /**
     * Este Setter permite editar el atributo de DNI.
     * @param nuevoDni  En este parametro se guardara el valor del DNI.
     */
    public void setDni(String nuevoDni){
        
        this.dni = nuevoDni;
        
    }
    
    /**
     * Este Setter permite editar la edad.
     * @param nuevaEdad En este parametro se guardara la edad.
     */
    
    public void setEdad(int nuevaEdad){
        
        this.edad = nuevaEdad;
    
    }
    
    //FIN DE LOS SETTERS
    
    
    //MÉTODO GENERAL
    
    /**
     * 
     * @param anyo En este parametro se guarda el anyo actual de la clase principal.
     * @return Devuelve el anyo de nacimiento calculado a partir del anyo actual y la edad.
     */
    
    //MÉTODOS DE LA CLASE PERSONA
    
    public int dameAnyoNacimiento(int anyo){
        
        return (anyo - this.edad);    
    }
    
    
    //INICIO DEL CONSTRUCTOR
    
    /**
     * Este constructor guarda datos de la persona.
     * @param nuevoNombre Este parametro guardara el nombre.
     * @param nuevoApellido Este parametro guardara los apellidos.
     * @param nuevoDni Este parametro guardara el DNI.
     * @param nuevaEdad Este parametro guardara la edad.
     */
    
    public Persona(String nuevoNombre, String nuevoApellido, String nuevoDni, int nuevaEdad)
    {
        this.nombre = nuevoNombre;
        this.apellidos = nuevoApellido;
        this.dni = nuevoDni;
        this.edad = nuevaEdad;
    }
    
    //FIN DEL CONSTRUCTOR
    
    }

//FIN DE LA CLASE
    


    



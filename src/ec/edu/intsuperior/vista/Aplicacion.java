
package ec.edu.intsuperior.vista;

import java.util.Scanner;
import ec.edu.intsuperior.modelo.Persona;

public class Aplicacion {
   public static void main(String [] args) {
       Scanner leer= new Scanner (System.in);
        Persona p1= new Persona();
        Persona p2= new Persona();
        Persona p3= new Persona();
        System.out.println("Ingrese el numero de la cedula de la persona 1: ");
        p1.setId(leer.next());
        System.out.println("Ingrese el Nombre: ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el Apellido: ");
        p1.setApellido(leer.next());
        System.out.println("Ingrese su Direccion: ");
        p1.setDireccion(leer.next());
        p1.setGenero(Persona.TipoGenero.Masculino);
        
        System.out.println(p1.toString());
    
        
        System.out.println("Ingrese el numero de la cedula de la persona 2");
        p2.setId(leer.next());
        System.out.println("Ingresa el Nombre: ");
        p2.setNombre(leer.next());
        System.out.println("Ingresa el Apellido: ");
        p2.setApellido(leer.next());
        p2.setGenero(Persona.TipoGenero.Femenino);
        
        System.out.println(p2.toString());
   } 
}

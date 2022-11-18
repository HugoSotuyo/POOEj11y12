/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej12;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class POOEj12 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        int edadNuevaPersona;
        Scanner leer=new Scanner(System.in);
        PersonaServicio person = new PersonaServicio();
        Persona persona=new Persona();
        person.crearPersona(persona);
        System.out.println("Nombre "+persona.getNombre());
        System.out.println("Fecha de nacimiento "+persona.getFechaNacimiento());
        System.out.println("Edad = "+person.calcularEdad(persona)+" años");
        System.out.println("Ingrese edad de otra persona ");
        edadNuevaPersona=leer.nextInt();
        System.out.println("Esta persona es menor (Resultado = False)");
        System.out.println("Esta persona es mayor (Resultado = True)");
        System.out.println("Resultado = "+person.menorQue(edadNuevaPersona, persona));
        person.mostrarPersona(persona);
    }
    
}

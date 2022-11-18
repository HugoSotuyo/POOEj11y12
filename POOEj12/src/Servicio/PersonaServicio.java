/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class PersonaServicio {
    
    public void crearPersona(Persona persona) throws ParseException {

        String fecha;
        //Date fechanacimiento=new Date();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre de la persona");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingrese fecha de nacimiento dd/mm/yyyy");
        fecha = leer.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");//String
        Date fechanacimiento = formato.parse(fecha);// a Date
        persona.setFechaNacimiento(fechanacimiento);//cargo como Date
        String fechaFormateada = formato.format(persona.getFechaNacimiento());
        persona.setFechaFormateada(fechaFormateada);
    }
    public int calcularEdad(Persona persona){
        int edad;
            Date fechaActual=new Date();
            edad=fechaActual.getYear()-persona.getFechaNacimiento().getYear();
        return edad;
    }
    public boolean menorQue(int edad,Persona persona){
        boolean resultado=false;
        int edadpersona;
        Date fechaActual = new Date();
        edadpersona=fechaActual.getYear()- persona.getFechaNacimiento().getYear();
        if(edadpersona < edad){
            resultado=true;
        }
        return resultado;
    }
    public void mostrarPersona(Persona persona){
        System.out.println("Nombre : "+persona.getNombre());
        System.out.println("Fecha de Nacimiento : "+persona.getFechaFormateada());
    }
}

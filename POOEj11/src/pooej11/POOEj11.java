/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class POOEj11 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        int dia,mes,anio,diferencia;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dia");
        dia=leer.nextInt();
        System.out.println("Ingrese mes");
        mes=leer.nextInt();
        System.out.println("Ingrese año");
        anio=leer.nextInt();
        
        Date fecha=new Date(anio,mes,dia);
        Date fechaActual=new Date();
        
        System.out.println(fechaActual);
        System.out.println("La fecha ingresada es "+fecha.getDate()+"/"+
        fecha.getMonth()+"/"+fecha.getYear());
        
        diferencia=fechaActual.getYear()-(fecha.getYear()-1900);
        System.out.println("La diferencia de años es "+diferencia+" años");
        
        /* para dar formato a la fecha podemos usar SimplaDateFormat, de esta
        manera podemos ingresar una fecha con formato string y devolverla en
        formato Date.
        */
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
        Date fecha2 = formato.parse("10/12/1972");//transforma un string en date
        
        System.out.println("Fecha 2 "+fecha2);//muestro un date
        System.out.println("Fecha 2 formateada "+ formato.format(fecha2));//doy 
        //formato a la fecha 2
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema6;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        muestraSueldo(calcularSueldo());
    }
    public static double solicitarDatos(String d){ //Solicita datos
        double miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextDouble();
        return miDato;
    }
    public static double calcularSueldo(){
    double hora = solicitarDatos("horas trabajadas ");
    double pagaxhora = solicitarDatos("paga por hora ");
    double total = 0;
     if (hora<=40){
         total=hora*pagaxhora;
     }if(hora>40 || hora==48){
            total=(40*pagaxhora)+(hora-40)*(2*pagaxhora);
     }if(hora>48){
                total=(40*pagaxhora)+8*(2*pagaxhora)+(hora-48)*(3*pagaxhora);
            }
     return total;
    }
    public static void muestraSueldo(double a){
        System.out.print("El sueldo es " + a);
    }
}

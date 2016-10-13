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
    }
}

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
    double hora = solicitarDatos("horas trabajadas "); //Se solicitan las horas trabajadas
    double pagaxhora = solicitarDatos("paga por hora "); //Se solicita la paga por hora
    double total = 0; //Inicializa la variable
     if (hora<=40){ //Si las horas son menores o iguales a 40
         total=hora*pagaxhora; //Se multiplicara la hora por la paga por hora
     }if(hora>40 && hora<=48){ //Si las horas son mayores a 40 y las horas son menores o iguales a 48
            total=(40*pagaxhora)+(hora-40)*(2*pagaxhora); //Se multiplica 40 por la paga por hora y se suma la multiplicacion de la resta de
                                                          //las horas menos 40 para obtener las horas que seran multiplicadas
                                                          //por el doble de la paga por hora
     }if(hora>48){
                total=(40*pagaxhora)+(8*(2*pagaxhora))+((hora-48)*(3*pagaxhora));//Se multiplica 40 por la paga por hora y se suma la multiplicacion de
                                                                                 //8 horas por el doble de la paga por hora y se suma
                                                                                 //la multiplicacion de la resta de las horas menos 40
                                                                                 //para obtener las horas que seran multiplicadas 
                                                                                 //por el triple de la paga por hora
            }
     return total;
    }
    public static void muestraSueldo(double a){
        System.out.print("El sueldo es " + a);
    }
}

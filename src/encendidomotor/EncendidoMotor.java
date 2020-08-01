/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encendidomotor;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
import java.util.Scanner;
interface Encendido_Motor_Otto{
    default String Control(String vehiculo){
        return "ENCENDIDO "+"\nEl vehiculo "+ vehiculo + " tiene un encendido electronico"
                + " controlado por la ECU.";
    }
}
interface Encendido_Motor_Electrico{
    default String Control(String vehiculo){
        return "El Vehiculo "+vehiculo+" es un vehiculo electrico con un encendido "
                + "más complejo ya que funciona a base de Baterias de Litio.";
    }
}
public class EncendidoMotor implements Encendido_Motor_Otto, Encendido_Motor_Electrico{
    /*@Override
    public String Control(String vehiculo){
        return Encendido_Motor_Otto.super.Control(vehiculo);
    }*/
     @Override
    public String Control(String vehiculo){
    return Encendido_Motor_Electrico.super.Control(vehiculo);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner com=new Scanner(System.in);
        
        EncendidoMotor encendido = new EncendidoMotor();
        
        System.out.println("      UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L");
        System.out.println("");
        System.out.println("Nombre: Aguaiza Quimbita Jonathan Fabricio");
        System.out.println("MATERIA: PROGRAMACION");
        System.out.println("CARRERA: INGENIERIA AUTOMOTRIZ");
        System.out.println("NRC: 7450");
        System.out.println(" ");
        System.out.println("Ingrese la marca del vehículo:");
        String r1=com.nextLine();
        System.out.println(" ");
        System.out.println(encendido.Control(r1));
        // TODO code application logic here
    }
    
}

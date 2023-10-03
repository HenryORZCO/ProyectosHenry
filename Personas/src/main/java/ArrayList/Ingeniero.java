/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author ZONA DIGITAL
 */
public class Ingeniero extends Persona {

    public Ingeniero(ArrayList Nombre, ArrayList Gastos) {
        super(Nombre, Gastos);
    }

    @Override
    public void IngresarNombre(String nombre) {
     super.Nombre.add(nombre);
     
    }

    @Override
    public void IngresarGastos(int gastos) {
        super.Gastos.add(gastos);
    }

    @Override
    public void BuscarNombre(String nombre) {
        
        String buscarnombre= "";
        if(super.Nombre.contains(nombre)==true){
            buscarnombre=super.Nombre.get(super.Nombre.indexOf(nombre)).toString();
            
        }else{
            buscarnombre="No existe Nombre";
        }
    }

    @Override
    public void BuscarGastos(int gastos) {
       int buscargatos=0;
       if(super.Gastos.contains(gastos)==true){
           buscargatos=Integer.parseInt(super.Gastos.get(super.Gastos.indexOf(gastos)).toString());
           
       }else{
           buscargatos=0;
       }
       
    }
    
}

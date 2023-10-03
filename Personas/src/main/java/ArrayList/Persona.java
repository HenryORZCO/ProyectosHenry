
package ArrayList;

import java.util.ArrayList;


public abstract class Persona {
    ArrayList Nombre;
    ArrayList Gastos;
    
    //Ingresamos contructor

    public Persona(ArrayList Nombre, ArrayList Gastos) {
        this.Nombre = Nombre;
        this.Gastos = Gastos;
    }

    public ArrayList getNombre() {
        return Nombre;
    }

    public void setNombre(ArrayList Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList getGastos() {
        return Gastos;
    }

    public void setGastos(ArrayList Gastos) {
        this.Gastos = Gastos;
    }
    //INGRESAMOS metodos a utilizar
    public abstract void IngresarNombre(String nombre);
    public abstract void IngresarGastos(int gastos);
    public abstract void BuscarNombre(String nombre);
    public abstract void BuscarGastos(int gastos);
    
}

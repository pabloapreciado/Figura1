package modelo;

import javax.swing.JOptionPane;
public class Cubo extends Figura
{
    //constructor
    //atributos
    protected double arista;
    //
    public Cubo(double arista,String nombre)
    { 
        this.nombre=nombre;
        this.arista=arista;
    
    }

    //metodos
    public void calcularVolumen()
    {
        volumen=arista*arista*arista;
        
    }
    public void mostrarVolumen()
    {
        JOptionPane.showMessageDialog(null,"el nombre de lafigura es :" + nombre  + " el area es " + volumen);
    }
    
}
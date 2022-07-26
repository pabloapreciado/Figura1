package modelo;

import javax.swing.JOptionPane;
public class Esfera extends Figura
{
    //constructor
    //atributos
    protected double radio;

    //
    public Esfera(double radio)
    { 
        this.radio=radio;
    }

    //metodos
    public void calcularVolumen()
    {
        volumen=4/3*Math.PI*radio*radio*radio;
        
    }
    public void mostrarVolumen()
    {
        JOptionPane.showMessageDialog(null,"el nombre de la figura es :" + nombre  + " el area es " + volumen);
    }
}

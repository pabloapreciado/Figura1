package modelo;

import javax.swing.JOptionPane;
public class Cono extends Figura
{
    //constructor
    //atributos
    protected double radio;
    protected double altura;
    //
    public Cono(double radio,double altura)
    { 
        this.radio=radio;
        this.altura=altura;
    }

    //metodos
    public void calcularVolumen()
    {
        volumen=Math.PI*radio*radio*altura/3;
        
    }
    public void mostrarVolumen()
    {
        JOptionPane.showMessageDialog(null,"el nombre de lafigura es :" + nombre  + " el area es " + volumen);
    }
}

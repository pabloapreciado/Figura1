package modelo;

import javax.swing.JOptionPane;
public class Cilindro extends Figura
{
    //constructor
    //atributos
    protected double radio;
    protected double altura;
    //
    public Cilindro(double radio,double altura)
    { 
        this.radio=radio;
        this.altura=altura;
    }

    //metodos
    public void calcularVolumen()
    {
        volumen=Math.PI*altura*radio*radio;
        
    }
    public void mostrarVolumen()
    {
        JOptionPane.showMessageDialog(null,"el nombre de lafigura es :" + nombre  + " el area es " + volumen);
    }
}
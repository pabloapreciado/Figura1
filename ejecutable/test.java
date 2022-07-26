package ejecutable;

import controlador.Controlador;
import modelo.Figura;
import vista.VentanaPrincipal;

public class test 
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Figura miFigura= new Figura();
        Controlador miControlador = new Controlador(miVentana, miFigura);
    }
}
    
        //entrada
        //String nombre=  JOptionPane.showInputDialog("Digite el nombre de la figura: ");
        //double arista=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la arista: "));

        //creacion de objeto cubo
        //Cubo miCubo=new Cubo(arista, nombre);
        //miCubo.calcularVolumen();
        //miCubo.mostrarNombre();
        //miCubo.mostrarVolumen();

       
        
     


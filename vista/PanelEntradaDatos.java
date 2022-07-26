/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author NESTOR JESUS PAEZ
 */
public class PanelEntradaDatos extends JPanel
{
    /*
    Elementos del panel (atributos)
    */
    private JLabel lbCentigrados;
    private JTextField tfCentrigrados;
    private JLabel lbVolumen;
    private JTextField tfVolumen;
    private JComboBox tfNombre;
  
    /*
    Método constructor de panel
    */
    public PanelEntradaDatos()
    {
        /*
        Definición contenedor del panel
        */
        setLayout(null);
        
        /*
        Definición color del panel
        */
        setBackground(Color.WHITE);
        
        /*
        Definición borde y titulo del panel
        */
        TitledBorder borde = BorderFactory.createTitledBorder("DATOS DE ENTRADA");
        borde.setTitleColor(Color.RED);
        setBorder(borde);
        
        /*
        Etiqueta cantidad de gramos
        */
        lbCentigrados = new JLabel("Figura:");
        add(lbCentigrados);
        lbCentigrados.setBounds(30,40,140,20);
        lbCentigrados.setFont(new Font("Arial",Font.BOLD,13));
        lbCentigrados.setForeground(Color.RED);
        
        /*
        Caja de texto cantidad de gramos
        */
        
        
        //Etiqueta voluman

        lbVolumen = new JLabel("Arista:");
        add(lbVolumen);
        lbVolumen.setBounds(300,40,140,20);
        lbVolumen.setFont(new Font("Arial",Font.BOLD,13));
        lbVolumen.setForeground(Color.RED);

        tfVolumen = new JTextField();
        add(tfVolumen);
        tfVolumen.setBounds(400,40,100,20);
        tfVolumen.setFont(new Font("Arial",Font.BOLD,20));
        tfVolumen.setForeground(Color.RED);
        
    
        
     //Creación e inserción del combo
     tfNombre = new JComboBox();
     String[] lista = {"Cilindro","Cono","Cubo","Esfera"};
     
     for(int i=0; i<lista.length;i++)
     {
         tfNombre.addItem(lista[i]);
     }
     tfNombre.setBounds(90,40,100,20);
     add(tfNombre);
    }
    
    //Método de acceso a la información

    public String getNombre()
{
    return tfNombre.getToolTipText();
}

public String getVolumen()
{
    return tfVolumen.getText();
}
public void borrar()
{
    tfVolumen.setText("");
    tfNombre.getToolTipText();
}

public Object getTfNombre() {
    return null;
}
}
    


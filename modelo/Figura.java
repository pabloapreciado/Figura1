package modelo;

public class Figura
{
    //atributos
    protected double volumen;
    protected String nombre;
    protected double resultado;

    public double mostrarResutado()
    {
        return this.resultado;
    }
    public String mostrarNombre()
    {
        return this.nombre;
    }
    public String getNombre() {
        return null;
    }
    public void setNombre(Object tfNombre) {
    }
}
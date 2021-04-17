package vehiculos;

public class Camion extends Vehiculo{
    private static int cantidadCamiones;
    private int ejes;

    static{
        cantidadCamiones=0;
    }

    public static int getCantidadCamiones(){
        return cantidadCamiones;
    }

    public Camion(String placa, String nombre, int peso, int precio, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, peso, precio, "4X2", fabricante);
        this.ejes = ejes;
        cantidadCamiones++;
    }

    public int getEjes(){
        return ejes;
    }

    public void setEjes(int ejes){
        this.ejes = ejes;
    }
}

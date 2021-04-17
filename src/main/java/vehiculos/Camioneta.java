package vehiculos;

public class Camioneta extends Vehiculo{
    private static int cantidadCamionetas;
    private boolean volco;

    static {
        cantidadCamionetas = 0;
    }

    public static int getCantidadCamionetas(){
        return cantidadCamionetas;
    }

    public Camioneta(String placa, int puertas, String nombre, int peso, int precio, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, peso, precio, "4X4", fabricante);
        this.volco = volco;
        cantidadCamionetas++;
    }

    public boolean isVolco(){
        return volco;
    }
}

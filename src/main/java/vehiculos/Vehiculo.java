package vehiculos;

public class Vehiculo {
    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected int peso;
    protected int precio;
    protected String traccion;
    protected Fabricante fabricante;

    public Vehiculo(
            String placa,
            int puertas,
            int velocidadMaxima,
            String nombre,
            int peso,
            int precio,
            String traccion,
            Fabricante fabricante)
    {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.peso = precio;
        this.precio = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;

        this.fabricante.agregarVenta();
    }

    public static int getCantidadVehiculos(){
        return Automovil.getCantidadAutomoviles()+Camioneta.getCantidadCamionetas() +Camion.getCantidadCamiones();
    }

    public static void setCantidadVehiculos(int i) {

    }

    public String vehiculosPorTipo(){
        return "Automoviles: " + Automovil.getCantidadAutomoviles() +"\n"
                +"Camionetas: " + Camioneta.getCantidadCamionetas() +"\n"
                +"Camiones: " + Camion.getCantidadCamiones();
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getTraccion() {
        return traccion;
    }

    public int getPrecio() {
        return precio;
    }

    public int getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }
}

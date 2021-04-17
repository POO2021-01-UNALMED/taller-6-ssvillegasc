package vehiculos;

import java.util.ArrayList;

public class Pais {
    private static ArrayList<Pais> listado = new ArrayList<>();
    private String nombre;
    private int numVentas;

    public Pais(String nombre) {
        this.nombre = nombre;
        listado.add(this);
    }

    public void agregarVenta(){
        numVentas++;
    }

    public int getVentas(){
        return  numVentas;
    }

    public static Pais paisMasVendedor() {
        Pais mayor = listado.get(0);
        for(Pais p: listado){
            if(p.getVentas() > mayor.getVentas()){
                mayor = p;
            }
        }
        return mayor;
    }

    public String getNombre() {
        return nombre;
    }
}

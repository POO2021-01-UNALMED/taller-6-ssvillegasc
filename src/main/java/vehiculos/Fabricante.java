package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private static ArrayList<Fabricante> listado = new ArrayList<>();
    private String nombre;
    private Pais pais;
    private int numVentas;

    public void agregarVenta(){
        numVentas++;
        pais.agregarVenta();
    }

    public int getVentas(){
        return numVentas;
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante mayor = listado.get(0);
        for(Fabricante f: listado){
            if(f.getVentas() > mayor.getVentas()){
                mayor = f;
            }
        }
        return mayor;
    }

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;

        listado.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }
}

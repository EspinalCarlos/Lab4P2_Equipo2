
package lab4p2_equipo2;


public class Planeta {
    private String nombre;
    private double distance;

    public Planeta() {
    }
    
    

    public Planeta(String nombre, double distance) {
        this.nombre = nombre;
        this.distance = distance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Nombre del planeta: " + nombre + "\nDistancia del planeta de la tierra: " + distance;
    }
    
    
    
    
}

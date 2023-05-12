
package lab4p2_equipo2;

import java.util.ArrayList;

public abstract class MedioTransporte {
    protected double cantTank;
    protected double kmTank;
    protected ArrayList<Primates> primates = new ArrayList();

    public MedioTransporte() {
    }

    public MedioTransporte(double cantTank, double kmTank) {
        this.cantTank = cantTank;
        this.kmTank = kmTank;
    }

    public double getCantTank() {
        return cantTank;
    }

    public void setCantTank(double cantTank) {
        this.cantTank = cantTank;
    }

    public double getKmTank() {
        return kmTank;
    }

    public void setKmTank(double kmTank) {
        this.kmTank = kmTank;
    }

    public ArrayList<Primates> getPrimates() {
        return primates;
    }

    public void setPrimates(ArrayList<Primates> primates) {
        this.primates = primates;
    }
    

    @Override
    public String toString() {
        return "Medio de Transporte" + "\nPorcentaje en el Tanque: " + cantTank + "\nKm con el Tanque lleno: " + kmTank + "\nPrimates: \n" + primates;
    }
    
    public abstract void consumo();
    
    public abstract void viaje();
    
    
}

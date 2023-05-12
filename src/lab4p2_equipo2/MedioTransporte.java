
package lab4p2_equipo2;

import java.util.ArrayList;

public abstract class MedioTransporte {
    protected double cantTank;
    protected double kmTank;
    protected double useTank;
    protected ArrayList<Primates> primates = new ArrayList();

    public MedioTransporte() {
    }

    public MedioTransporte(double cantTank, double kmTank,double useTank) {
        this.cantTank = cantTank;
        this.kmTank = kmTank;
        this.useTank= useTank;
    }

    public double getUseTank() {
        return useTank;
    }

    public void setUseTank(double useTank) {
        this.useTank = useTank;
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
        return "Porcentaje en el Tanque: " + cantTank + "\nKm con el Tanque lleno: " + kmTank + "\nPrimates: " + primates+"\nCantidad de uso del tanque: "+useTank+"\n";
    }
    
    
    public abstract void viaje(Planeta planeta);
    
    
}

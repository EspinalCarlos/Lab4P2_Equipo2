
package lab4p2_equipo2;

import java.util.ArrayList;


public class AereoNormal extends MedioTransporte{
    private int maxPasajeros;
    private double LongitudTotal;
    private int cantMotores;

    public AereoNormal() {
        super();
    }

    public AereoNormal(int maxPasajeros, double LongitudTotal, int cantMotores, double cantTank, double kmTank) {
        super(cantTank, kmTank);
        this.maxPasajeros = maxPasajeros;
        this.LongitudTotal = LongitudTotal;
        this.cantMotores = cantMotores;
    }

    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    public void setMaxPasajeros(int maxPasajeros) {
        this.maxPasajeros = maxPasajeros;
    }

    public double getLongitudTotal() {
        return LongitudTotal;
    }

    public void setLongitudTotal(double LongitudTotal) {
        this.LongitudTotal = LongitudTotal;
    }

    public int getCantMotores() {
        return cantMotores;
    }

    public void setCantMotores(int cantMotores) {
        this.cantMotores = cantMotores;
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
        return super.toString()+"\nAereoNormal" + "\nmaxPasajeros: " + maxPasajeros + "\nLongitudTotal: " + LongitudTotal + "\nCantidad de Motores: " + cantMotores;
    }

    @Override
    public void consumo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void viaje() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}

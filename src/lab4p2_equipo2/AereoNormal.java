
package lab4p2_equipo2;

import java.util.ArrayList;
import java.util.Random;


public class AereoNormal extends MedioTransporte{
    static Random ran=new Random();
    private int maxPasajeros;
    private double LongitudTotal;
    private int cantMotores;

    public AereoNormal() {
        super();
    }

    public AereoNormal(int maxPasajeros, double LongitudTotal, int cantMotores) {
        this.maxPasajeros = maxPasajeros;
        this.LongitudTotal = LongitudTotal;
        this.cantMotores = cantMotores;
    }

    public AereoNormal(int maxPasajeros, double LongitudTotal, int cantMotores, double cantTank, double kmTank, double useTank) {
        super(cantTank, kmTank, useTank);
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
        return super.toString()+"\nCantidad Maxima de Pasajeros: " + maxPasajeros + "\nLongitud Total: " + LongitudTotal + "\nCantidad de Motores: " + cantMotores+"\n";
    }



    @Override
    public void viaje(Planeta planeta) {
        if(this.cantTank>=this.useTank&& this.primates.isEmpty()){
            for (Primates primate : primates) {
                if(primate.getCantcomida()>primate.getComeKM()*planeta.getDistance()){
                    double consumo=(planeta.getDistance()*0.15)+ran.nextInt(25,100);
                    int b = (primate.getComeKM())*((int)planeta.getDistance());
                    int a = primate.getCantcomida()-b;
                     primate.setCantcomida(a);
                     useTank=useTank-consumo;
                }else
                    System.out.println("Algun primate no le ajusta la comida");
            }
            
        }else
            System.out.println("No se puede realizar el viaje");
        
    }
    
    
    
    
}

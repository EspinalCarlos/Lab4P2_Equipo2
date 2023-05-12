/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo2;

/**
 *
 * @author SURFACEB2I7
 */
public class Primates extends seresVivos{
    private MedioTransporte transporte;
    private int cantcomida;
    private int comeKM;
    private String nacimiento;

    public Primates() {
        super();
    }

    public Primates(MedioTransporte transporte, int cantcomida, int comeKM, String nacimiento) {
        this.transporte = transporte;
        this.cantcomida = cantcomida;
        this.comeKM = comeKM;
        this.nacimiento = nacimiento;
    }

    public Primates(MedioTransporte transporte, int cantcomida, int comeKM, String nacimiento, String name, String gSanguineo, String genero, double altura, double peso) {
        super(name, gSanguineo, genero, altura, peso);
        this.transporte = transporte;
        this.cantcomida = cantcomida;
        this.comeKM = comeKM;
        this.nacimiento = nacimiento;
    }

    public MedioTransporte getTransporte() {
        return transporte;
    }

    public void setTransporte(MedioTransporte transporte) {
        this.transporte = transporte;
    }

    public int getCantcomida() {
        return cantcomida;
    }

    public void setCantcomida(int cantcomida) {
        this.cantcomida = cantcomida;
    }

    public int getComeKM() {
        return comeKM;
    }

    public void setComeKM(int comeKM) {
        this.comeKM = comeKM;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Transporte: " + transporte + "\n Cantidad de Comida: " + cantcomida + "\nCuanto come por KM=" + comeKM + "\nLugar de Nacimiento del primate: " + nacimiento + "\n";
    }
    
    
}

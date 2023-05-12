/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo2;

import java.util.Random;

public class AereoEspacial extends MedioTransporte{
    static Random ran=new Random();
    private String tipoConbustible;
    private String tipo;

    public AereoEspacial() {
        super();
    }

    public AereoEspacial(String tipoConbustible, String tipo) {
        this.tipoConbustible = tipoConbustible;
        this.tipo = tipo;
    }

    

    public String getTipoConbustible() {
        return tipoConbustible;
    }

    public void setTipoConbustible(String tipoConbustible) {
        this.tipoConbustible = tipoConbustible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public void viaje(Planeta planeta) {
        double consumo=((planeta.getDistance()*0.32)+(ran.nextInt(25, 35)+3)*3/2);
    }

    @Override
    public String toString() {
        return super.toString()+"AereoEspacial{" + "tipoConbustible=" + tipoConbustible + ", tipo=" + tipo + '}';
    }
    
    
}

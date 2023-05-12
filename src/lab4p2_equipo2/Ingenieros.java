/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo2;

/**
 *
 * @author SURFACEB2I7
 */
public class Ingenieros extends seresVivos{
    private int RRHH;
    private String usuario;
    private String Contrasena;

    public Ingenieros() {
        super();
    }


    public Ingenieros(int RRHH, String usuario, String Contrasena, String name, String gSanguineo, String genero, double altura, double peso) {
        super(name, gSanguineo, genero, altura, peso);
        this.RRHH = RRHH;
        this.usuario = usuario;
        this.Contrasena = Contrasena;
    }

    public int getRRHH() {
        return RRHH;
    }

    public void setRRHH(int RRHH) {
        this.RRHH = RRHH;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    @Override
    public String toString() {
        return  super.toString()+"RRHH del ingeniero: " + RRHH + "\n Usuario: " + usuario + "\nContrasena: " + Contrasena + "\n";
    }
    
    
    
    
    
    
}


package lab4p2_equipo2;

public class seresVivos {
    protected String name;
    protected String gSanguineo;
    protected String genero;
    protected double altura;
    protected double peso;

    public seresVivos() {
    }

    
    
    public seresVivos(String name, String gSanguineo, String genero, double altura, double peso) {
        this.name = name;
        this.gSanguineo = gSanguineo;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getgSanguineo() {
        return gSanguineo;
    }

    public void setgSanguineo(String gSanguineo) {
        this.gSanguineo = gSanguineo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\nGrupo Sanguineo: " + gSanguineo + "\nGenero de la persona: " + genero + "\nAltura: " + altura + "\nPeso: " + peso + "\n";
    }
    
    
    
}

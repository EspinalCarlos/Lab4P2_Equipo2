
package lab4p2_equipo2;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab4P2_Equipo2 {
    static ArrayList<seresVivos> beings = new ArrayList();
    static ArrayList<MedioTransporte> tp = new ArrayList();
    static ArrayList<Planeta> planetss = new ArrayList();
    static ArrayList<MedioTransporte> mts = new ArrayList();
    
    static Scanner read = new Scanner(System.in);
    public static void menu1(){
        System.out.println("""
                           ---- Menu Principal ----
                           
                           1. Crear Ingeniero
                           2. Crear Primate
                           3. Crear Planeta
                           4. Crear medio de Transporte
                           5. Modificar algo
                           6. Eliminar algo
                           7. Listar algo
                           8. Salir del sistema
                           
                           """);
    }
    public static void menu2(){
        System.out.println("""
                           ---- Ingrese el tipo de Transporte ----
                           
                           1. Aereo Normal
                           2. Aerero Especial
                           
                           """);
    }
    
    public static void menuDel(){
        System.out.println("""
                           ---- Ingrese el tipo de cosa que quiere eliminar ----
                           
                           1. serVivo
                           2. Planeta
                           3. Medio de Transporte
                           
                           
                           """);
    }
    public static void main(String[] args) {
        //Carlos Espinal 12151049
        //Akeem Ieong Ham 12241250
        
        int o0 = 0;
        
        while(o0 != 8){
            menu1();
            int opc1 = read.nextInt();
            switch(opc1){
                case 1:{
                    System.out.println("Ingrese el nombre: ");
                    read.nextLine();
                    String nombre = read.nextLine();
                    System.out.println("Ingrese grupo sanguineo: ");
                    String gSan = read.nextLine();
                    System.out.println("Ingrese el genero: ");
                    String gender = read.nextLine();
                    System.out.println("Ingrese la altura (con decimales): ");
                    double height = read.nextDouble();
                    System.out.println("Ingrese el peso (con decimales): ");
                    double weight = read.nextDouble();
                    System.out.println("Ingrese el numero de RRHH: ");
                    int rrhh = read.nextInt();
                    System.out.println("Ingrese el nombre de usuario: ");
                    read.nextLine();
                    String user = read.nextLine();
                    System.out.println("Ingrese la password: ");
                    String pass = read.nextLine();
                    
                    beings.add(new Ingenieros(rrhh, user, pass, nombre, gSan, gender, height, weight));
                    
                    
                    
                    
                    
                }break;
                case 2:{
                    System.out.println("Ingrese el nombre: ");
                    read.nextLine();
                    String nombre = read.nextLine();
                    System.out.println("Ingrese grupo sanguineo: ");
                    String gSan = read.nextLine();
                    System.out.println("Ingrese el genero: ");
                    String gender = read.nextLine();
                    System.out.println("Ingrese la altura (con decimales): ");
                    double height = read.nextDouble();
                    System.out.println("Ingrese el peso (con decimales): ");
                    double weight = read.nextDouble();
                    
                    System.out.println("--- ASIGNAR TRANSPORTE ---");
                    for (MedioTransporte t : tp) {
                        System.out.println("Nave #"+tp.indexOf(t));
                    }
                    int opctrans = read.nextInt();
                    MedioTransporte mt = tp.get(opctrans);
                    System.out.println("Ingrese la cantidad de comida: ");
                    int cComida = read.nextInt();
                    System.out.println("Ingrese cuanto come por km: ");
                    int kmComida = read.nextInt();
                    System.out.println("Ingrese lugar de nacimiento: ");
                    read.nextLine();
                    String birthl = read.nextLine();
                    
                    beings.add(new Primates(mt, cComida, kmComida, birthl, nombre, gSan, gender, height, weight));
                    JOptionPane.showMessageDialog(null, "Primate creado");
                    
                    
                }break;
                case 3:
                    System.out.println("Ingrese el nombre del planeta: ");
                    read.nextLine();
                    String planame = read.nextLine();
                    System.out.println("Ingrese la distancia desde la tierra: ");
                    double dist = read.nextDouble();
                    
                    planetss.add(new Planeta(planame,dist));
                    
                    break;
                case 4:
                    menu2();
                    int opcmt = read.nextInt();
                    switch(opcmt){
                        case 1:{
                            System.out.println("Ingrese porcentaje del tanque: ");
                            double porc = read.nextDouble();
                            System.out.println("Ingrese una cantidad de km que puede recorrer con el tanque lleno :");
                            double kmcant = read.nextDouble();
                            System.out.println("Ingrese la cantidad de galones: ");
                            double gallons = read.nextDouble();
                            boolean prosiga = true;
                            ArrayList<Primates> p = new ArrayList();
                            while (prosiga) {
                                System.out.println("--- LISTA DE PRIMARES ---");
                                for (seresVivos t : beings) {
                                    if (t instanceof Primates) {
                                        System.out.println(beings.indexOf(t) + "- " + t.getName());
                                    }
                                }
                                System.out.println("Ingrese el indice del primate a agregar:  ");
                                int indp = read.nextInt();
                                p.add((Primates)beings.get(indp));
                                System.out.println("Desea seguir agregando?[S/N]: ");
                                char yn = read.next().charAt(0);
                                if (yn == 'Y' || yn == 'y') {
                                } else{
                                    prosiga = false;
                                }
                            }
                            System.out.println("Ingrese la cantidad maxima de pasajeros: ");
                            int pascant = read.nextInt();
                            System.out.println("Ingrese la longitud total: ");
                            double longtot = read.nextDouble();
                            System.out.println("Ingrese la cantidad de motores: ");
                            int cMotores = read.nextInt();
                            
                            mts.add(new AereoNormal(pascant, longtot, cMotores, porc, kmcant, gallons));
                            
                        }break;
                        case 2:{
                            System.out.println("Ingrese porcentaje del tanque: ");
                            double porc = read.nextDouble();
                            System.out.println("Ingrese una cantidad de km que puede recorrer con el tanque lleno :");
                            double kmcant = read.nextDouble();
                            System.out.println("Ingrese la cantidad en galones de fuel: ");
                            double gal = read.nextDouble();
                            boolean prosiga = true;
                            ArrayList<Primates> p = new ArrayList();
                            while (prosiga) {
                                System.out.println("--- LISTA DE PRIMARES ---");
                                for (seresVivos t : beings) {
                                    if (t instanceof Primates) {
                                        System.out.println(beings.indexOf(t) + "- " + t.getName());
                                    }
                                }
                                System.out.println("Ingrese el indice del primate a agregar:  ");
                                int indp = read.nextInt();
                                p.add((Primates)beings.get(indp));
                                System.out.println("Desea seguir agregando?[S/N]: ");
                                char yn = read.next().charAt(0);
                                if (yn == 'Y' || yn == 'y') {
                                } else{
                                    prosiga = false;
                                }
                            }
                            System.out.println("Ingrese el tipo de combustible: ");
                            read.nextLine();
                            String fuelt = read.nextLine();
                            System.out.println("Es de combate? [S/N]: ");
                            char yncombat = read.next().charAt(0);
                            String fight = "";
                            if (yncombat == 's' || yncombat == 'S') {
                                fight = "Pelea";
                            } else{
                                fight = "No de pelea";
                            }
                            
                            mts.add(new AereoEspacial(fuelt, fight, porc, kmcant, gal));
                            
                        }break;
                    }
                    
                    break;
                case 5:
                    break;
                case 6:
                    menuDel();
                    int indDel = read.nextInt();
                    switch(indDel){
                        case 1:
                            System.out.println("---- Eliga un indice ----");
                            for (seresVivos being : beings) {
                                System.out.println(beings.indexOf(being)+"- "+being.getName());
                            }
                            int indDelBeings = read.nextInt();
                            beings.remove(indDelBeings);
                            
                            break;
                        case 2:
                            System.out.println("---- Eliga un indice ----");
                            for (Planeta p : planetss) {
                                System.out.println(planetss.indexOf(p)+"- "+p.getNombre());
                            }
                            int indDelPl = read.nextInt();
                            planetss.remove(indDelPl);
                            break;
                        case 3:
                            System.out.println("---- Eliga un indice ----");
                            for (MedioTransporte mt : mts) {
                                System.out.println(mts.indexOf(mt));
                            }
                            int indDelMT = read.nextInt();
                            mts.remove(indDelMT);
                            break;
                    }
                    break; 
                case 7:
                    break; 
                case 8:
                    break;
            }
        }
      
        
        
    }
    
}

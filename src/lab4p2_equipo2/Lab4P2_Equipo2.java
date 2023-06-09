
package lab4p2_equipo2;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab4P2_Equipo2 {
    static ArrayList<seresVivos> beings = new ArrayList();
    static ArrayList<MedioTransporte> tp = new ArrayList();
    static ArrayList<Planeta> planetss = new ArrayList();
    
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
    
    public static void menuList(){
        System.out.println("""
                           ---- Ingrese el tipo de cosa que quiere listar ----
                           
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
                    /*
                    System.out.println("--- ASIGNAR TRANSPORTE ---");
                    for (MedioTransporte t : tp) {
                        System.out.println("Nave #"+tp.indexOf(t));
                    }
*/
                   
        
                    System.out.println("Ingrese la cantidad de comida: ");
                    int cComida = read.nextInt();
                    System.out.println("Ingrese cuanto come por km: ");
                    int kmComida = read.nextInt();
                    System.out.println("Ingrese lugar de nacimiento: ");
                   
                    String birthl = read.next();
                    
                    beings.add(new Primates(cComida, kmComida, birthl, nombre, gSan, gender, height, weight));
                    //JOptionPane.showMessageDialog(null, "Primate creado");
                    
                    
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
                            int indp = 0;
                            while (prosiga) {
                                System.out.println("--- LISTA DE PRIMARES ---");
                                for (seresVivos t : beings) {
                                    if (t instanceof Primates) {
                                        System.out.println(beings.indexOf(t) + "- " + t.getName());
                                    }
                                }
                                System.out.println("Ingrese el indice del primate a agregar:  ");
                                indp = read.nextInt();
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
                            MedioTransporte aaa = new AereoNormal(pascant, longtot, cMotores, porc, kmcant, gallons);
                            
                            aaa.getPrimates().get(indp).setTransporte(aaa);
                            
                            tp.add(aaa);
                            
                            
                            
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
                            
                            tp.add(new AereoEspacial(fuelt, fight, porc, kmcant, gal));
                            
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
                            for (MedioTransporte mt : tp) {
                                System.out.println(tp.indexOf(mt));
                            }
                            int indDelMT = read.nextInt();
                            tp.remove(indDelMT);
                            break;
                    }
                    break; 
                case 7:
                    menuList();
                    int opcList = read.nextInt();
                    
                    switch(opcList){
                        case 1:
                            for (seresVivos being : beings) {
                                System.out.println(beings.indexOf(being));
                            }
                            System.out.println("Ingrese el indice a listar: ");
                            int indlist = read.nextInt();
                            
                            System.out.println(beings.get(indlist));
                            break;
                        case 2:
                            for (Planeta p : planetss) {
                                System.out.println(beings.indexOf(p));
                            }
                            System.out.println("Ingrese el indice a listar: ");
                            int indlist2 = read.nextInt();
                            
                            System.out.println(planetss.get(indlist2));
                            break;
                        case 3:
                            for (MedioTransporte mts : tp) {
                                System.out.println(beings.indexOf(mts));
                            }
                            System.out.println("Ingrese el indice a listar: ");
                            int indlist3 = read.nextInt();
                            
                            System.out.println(tp.get(indlist3));
                            break;
                    }
                    
                    break; 
                case 8:
                    System.out.println("Ingrese el usuario: ");
                    read.nextLine();
                    String userver = read.nextLine();
                    System.out.println("Ingrese la password: ");
                    String passver = read.nextLine();
                    
                    for (seresVivos being : beings) {
                        if (being instanceof Ingenieros) {
                            if (((Ingenieros)being).getUsuario().equals(userver) && ((Ingenieros)being).getContrasena().equals(passver)) {
                                for (MedioTransporte mt : tp) {
                                    System.out.println(tp.indexOf(mt));
                                }
                                System.out.println("Ingrese el indice: ");
                                int indsim = read.nextInt();
                                
                                for (Planeta planets : planetss) {
                                    System.out.println(planetss.indexOf(planets)+"- "+ planets.getNombre());
                                }
                                System.out.println("Ingrese el indice: ");
                                int indplansim = read.nextInt();
                                
                                tp.get(indsim).viaje(planetss.get(indplansim));
                                
                            }
                        }
                    }
                    break;
            }
        }
      
        
        
    }
    
}

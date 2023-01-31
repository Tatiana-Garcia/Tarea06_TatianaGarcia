
package clase20230130;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Clase20230130 {
    static Scanner leer = new Scanner (System.in);
    

    public static void main(String[] args) {
        Casa c = new Casa();
        ArrayList <Casa> lista = new ArrayList();
        int menu =0;
        
        while (menu != 11) {            
            System.out.println("\n--Colonia Miramontes--\n"
                    + "1. Agregar Casa\n"
                    + "2. Eliminar Casa\n"
                    + "3. Listar Casas\n"
                    + "4. Modificar Color de Casa\n"
                    + "5. Modificar Cocina\n"
                    + "6. Listar Sala\n"
                    + "7. Modificar Dormitorio\n"
                    + "8. Agregar Dormitorio\n"
                    + "9. Modificar Sala\n"
                    + "10. Eliminar Dormitorio\n"
                    + "11. Salir");
            menu = leer.nextInt();
            switch(menu){
                case 1:{
                    lista.add(AgregarCasa());
                    break;
                }
                case 2: {
                    System.out.println("Ingrese la posicion de la casa a eliminar: ");
                    int pos = leer.nextInt();
                    if(pos>=0 && pos<lista.size()){
                        if(lista.get(pos) instanceof Casa){
                            lista.remove(pos);
                        }
                    }
                    else{
                        System.out.println("Posicion entregada no valida");;
                    }
                    break;
                }
                case 3: {
                    System.out.println(Listar(lista));
                    break;
                }
                case 4: {
                    System.out.println("Ingrese la posicion de la casa a modificar color: ");
                    int pos = leer.nextInt();
                    if(pos>=0 && pos<lista.size()){
                        if(lista.get(pos) instanceof Casa){
                            ((Casa)lista.get(pos)).setColor(
                                    JColorChooser.showDialog(null,
                                            "Seleccione color: ",
                                            ( (Casa)lista.get(pos) ).getColor()  ));
                        }
                    }
                    else{
                        System.out.println("Posicion entregada no valida");;
                    }
                    break;
                }
                case 5: {
                    System.out.println("Ingrese la posicion de la casa a modificar cocina: ");
                    int pos = leer.nextInt();
                    if(pos>=0 && pos<lista.size()){
                        if(lista.get(pos) instanceof Casa){
                            int op =0; 
                            while(op !=4){
                                System.out.println("Que desea modificar: \n"
                                        + "1. Refri\n"
                                        + "2. Micro\n"
                                        + "3. Tamaño\n"
                                        + "4. Regresar/Nada");
                                op = leer.nextInt();
                                switch (op) {
                                    case 1: {
                                        c.getCocina().setRefri(AgregarRefri());
                                        break;
                                    }
                                    case 2:{
                                        c.getCocina().setMicro(AgregarMicro());
                                        break;
                                    }
                                    case 3:{
                                        System.out.println("Ingrese el nuevo tamaño: ");
                                        int tam = leer.nextInt();
                                        c.getCocina().setTamanio(tam);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    else{
                        System.out.println("Posicion entregada no valida");;
                    }
                    break;
                }
                case 6: {
                    System.out.println("Sala: ");
                    //ArrayList <String> cu= lista.get(0).getSala().getCuadros();
                    System.out.println(Listar2(lista.get(0).getSala().getCuadros()));
                    System.out.println(Listar2(lista.get(0).getSala().getSillones()));
                    break;
                }
                case 7: {
                    System.out.println("Ingrese la posicion de la casa a modificar dormitorio: ");
                    int pos = leer.nextInt();
                    if(pos>=0 && pos<lista.size()){
                        if(lista.get(pos) instanceof Casa){
                            System.out.println("Ingresar posicion de dormitorio a modificar: ");
                            int pos2 = leer.nextInt();
                            if(pos2>=0 && pos2<c.getDormitorios().size()){
                                int op =0; 
                                while(op !=4){
                                    System.out.println("Que desea modificar: \n"
                                            + "1. Cama\n"
                                            + "2. Armario\n"
                                            + "3. Regresar/Nada");
                                    op = leer.nextInt();
                                    switch (op) {
                                        case 1: {
                                            c.getDormitorios().get(pos2).setCama(AgregarCama());
                                            break;
                                        }
                                        case 2:{
                                            System.out.println("Ingresar nombre del armario");
                                            leer = new Scanner(System.in);
                                            String armario = leer.nextLine();
                                            c.getDormitorios().get(pos2).setArmario(armario);
                                            break;
                                        }
                                    }
                                }
                            }      
                        }
                    }
                    else{
                        System.out.println("Posicion entregada no valida");;
                    }
                    break;
                }
                case 8 : {
                    c.getDormitorios().add(AgregarDormitorio());
                    break;
                }
                case 9: {
                    System.out.println("Ingrese la posicion de la casa a modificar sala: ");
                    int pos = leer.nextInt();
                    if(pos>=0 && pos<lista.size()){
                        if(lista.get(pos) instanceof Casa){
                            int op =0; 
                            while(op !=3){
                                System.out.println("Que desea modificar: \n"
                                        + "1. Sillones\n"
                                        + "2. Cuadros\n"
                                        + "3. Regresar/Nada");
                                op = leer.nextInt();
                                switch (op) {
                                    case 1: {
                                        System.out.println("Ingresar posicion de sillon a modificar: ");
                                        int pos2 = leer.nextInt();
                                        if(pos2>=0 && pos2<c.getSala().getSillones().size()){
                                            System.out.println("Ingrese sillon: ");
                                            leer = new Scanner(System.in);
                                            String element = leer.nextLine();
                                            c.getSala().sillones.set(pos2, element);
                                        }
                                        break;
                                    }
                                    case 2:{
                                        System.out.println("Ingresar posicion de cuadro a modificar: ");
                                        int pos2 = leer.nextInt();
                                        if(pos2>=0 && pos2<c.getSala().getCuadros().size()){
                                            System.out.println("Ingrese cuadro: ");
                                            leer = new Scanner(System.in);
                                            String element = leer.nextLine();
                                            c.getSala().cuadros.set(pos2, element);
                                        }
                                        break;
                                    }
                                }
                            }
                                  
                        }
                    }
                    else{
                        System.out.println("Posicion entregada no valida");;
                    }
                    break;
                }
                case 10:{
                    System.out.println("Ingrese la posicion de la casa a modificar dormitorio: ");
                    int pos = leer.nextInt();
                    if(pos>=0 && pos<lista.size()){
                        if(lista.get(pos) instanceof Casa){
                            System.out.println("Ingresar posicion de dormitorio a modificar: ");
                            int pos2 = leer.nextInt();
                            if(pos2>=0 && pos2<c.getDormitorios().size()){
                                c.getDormitorios().remove(pos2);
                            }
                        }
                    }
                    break;
                }
                default: {
                    break;
                }
                
            }//Fin del menu
            
        }//Fin del while del menu
    }//FIn de la clase 
    static Casa AgregarCasa(){
        Casa retorno;
        Color c; 
        
        Cocina cocina;
        cocina = AgregarCocina();
        Sala sala;
        sala = AgregarSala();
        
        ArrayList<Dormitorio> dormitorios = new ArrayList();
        dormitorios.add(AgregarDormitorio());
        
        System.out.println("Seleccione el color de la casa: ");
        leer = new Scanner (System.in);
        c = JColorChooser.showDialog(null, "Seleccione color", Color.black);
        
        retorno = new Casa(c, cocina, sala);
        
        return retorno;
    }
    static Cocina AgregarCocina(){
        Cocina retorno;
        ArrayList<String> utencilios = new ArrayList();
        int tamaño; 
        Refri refri; 
        Micro micro; 
        
        System.out.println("Ingrese utencilios: ");
        leer = new Scanner (System.in);
        String o1 = leer.nextLine();
        utencilios.add(o1);
        
        System.out.println("Ingrese el tamaño de la cocina: ");
        tamaño = leer.nextInt();
        
        refri = AgregarRefri();
        micro = AgregarMicro();
        
        retorno = new Cocina(tamaño, refri, micro);
        
        return retorno;
    }
    static Sala AgregarSala(){
        Sala retorno;
        ArrayList <String> sillones = new ArrayList();
        String o1,o2;
        
        System.out.println("Ingrese sillones: ");
        leer = new Scanner (System.in);
        o1 = leer.nextLine();
        sillones.add(o1);
        
        ArrayList <String> cuadros = new ArrayList();
        System.out.println("Ingrese cuadros: ");
        leer = new Scanner (System.in);
        o2 = leer.nextLine();
        cuadros.add(o2);
        
        retorno = new Sala();
        return retorno; 
    }
    static Refri AgregarRefri(){
        Refri retorno;
        String marca, modelo;
        int tamanio; 
        Color color;
        
        System.out.println("Ingrese la marca de la Refri: ");
        leer = new Scanner (System.in);
        marca = leer.nextLine();
        
        System.out.println("Ingrese el modelo de la Refri: ");
        leer = new Scanner (System.in);
        modelo = leer.nextLine();
        
        System.out.println("Ingrese tamaño de la Refri: ");
        tamanio = leer.nextInt();
        
        System.out.println("Seleccione el color de la Refri: ");
        leer = new Scanner (System.in);
        color = JColorChooser.showDialog(null, "Seleccione color", Color.black);
        
        retorno = new Refri(marca, modelo, tamanio, color);
        return retorno;
    }
    static Micro AgregarMicro(){
        Micro retorno;
        String marca;
        double potencia; 
        
        System.out.println("Ingrese la marca del micro: ");
        leer = new Scanner (System.in);
        marca = leer.nextLine();
        
        System.out.println("Ingrese la potencia del micro: ");
        potencia = leer.nextDouble();
        
        retorno = new Micro(marca, potencia);
        return retorno;
    }
    static Dormitorio AgregarDormitorio(){
        Dormitorio retorno;
        Cama cama;
        String armario;
        
        System.out.println("Ingrese el armario a agregar: ");
        leer = new Scanner (System.in);
        armario = leer.nextLine();
        cama = AgregarCama();
        retorno = new Dormitorio(cama, armario);
        return retorno;
    }
    static Cama AgregarCama(){
        Cama retorno;
        String marca, tamaño;
        Color color;
        
        System.out.println("Ingrese la marca de la cama: ");
        leer = new Scanner (System.in);
        marca = leer.nextLine();
        
        System.out.println("Ingrese el tamaño de la cama: ");
        leer = new Scanner (System.in);
        tamaño = leer.nextLine();
        
        System.out.println("Seleccione color de la cama: ");
        leer = new Scanner (System.in);
        color =JColorChooser.showDialog(null, "Seleccione color", Color.black);
        retorno = new Cama(marca, tamaño, color);
        return retorno;
    }
    static String Listar (ArrayList lista){
        String s=""; 
        for (Object t : lista) {
            if(t instanceof Casa){
                s += "Posicion: "+lista.indexOf(t)+": "+t+"\n"; 
            }
        }
        return s;
    }
    static String Listar2 (ArrayList<String> lista){
        String s=""; 
        for (String t : lista) {
           
            s += " "+t+"\n"; 
            
        }
        return s;
    }
    
}

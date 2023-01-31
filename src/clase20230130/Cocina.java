
package clase20230130;

import java.util.ArrayList;

public class Cocina {
    private int tamanio;
    private ArrayList<String> utencilios = new ArrayList();
    private Refri refri;
    private Micro micro;

    public Cocina() {
    }

    public Cocina(int tamanio, Refri refri, Micro micro) {
        this.tamanio = tamanio;
        this.refri = refri;
        this.micro = micro;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public ArrayList<String> getUtencilios() {
        return utencilios;
    }

    public void setUtencilios(ArrayList<String> utencilios) {
        this.utencilios = utencilios;
    }

    public Refri getRefri() {
        return refri;
    }

    public void setRefri(Refri refri) {
        this.refri = refri;
    }

    public Micro getMicro() {
        return micro;
    }

    public void setMicro(Micro micro) {
        this.micro = micro;
    }

    @Override
    public String toString() {
        return "\n Cocina:\n Tamaño: " + tamanio + 
                "\n Utencilios: " + Listar(utencilios) + 
                "\n Refri: " + refri + 
                "\n Micro: " + micro ;
    }
    static String Listar (ArrayList<String> lista){
        String s=""; 
        for (String t : lista) {
           
            s += " "+t+"\n"; 
            
        }
        return s;
    }
}

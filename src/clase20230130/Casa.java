
package clase20230130;

import java.awt.Color;
import java.util.ArrayList;

public class Casa {
    private Color color;
    private Cocina cocina;
    private Sala sala;
    private ArrayList<Dormitorio> dormitorios = new ArrayList();

    public Casa() {
    }

    public Casa(Color color, Cocina cocina, Sala sala) {
        this.color = color;
        this.cocina = cocina;
        this.sala = sala;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Cocina getCocina() {
        return cocina;
    }

    public void setCocina(Cocina cocina) {
        this.cocina = cocina;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public ArrayList<Dormitorio> getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(ArrayList<Dormitorio> dormitorios) {
        this.dormitorios = dormitorios;
    }

    @Override
    public String toString() {
        return "Casa:\n Color: " + color + 
                "\n Cocina: " + cocina + 
                "\n Sala: " + sala + 
                "\n Dormitorios: " + Listar(dormitorios);
    }
    static String Listar (ArrayList lista){
        String s=""; 
        for (Object t : lista) {
            if(t instanceof Casa){
                s += " "+t+"\n"; 
            }
        }
        return s;
    }
    
}

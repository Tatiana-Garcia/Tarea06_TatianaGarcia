
package clase20230130;

import java.util.ArrayList;

public class Sala {
    ArrayList<String>sillones = new ArrayList();
    ArrayList<String>cuadros = new ArrayList();

    public Sala() {
    }

    public ArrayList<String> getSillones() {
        return sillones;
    }

    public void setSillones(ArrayList<String> sillones) {
        this.sillones = sillones;
    }

    public ArrayList<String> getCuadros() {
        return cuadros;
    }

    public void setCuadros(ArrayList<String> cuadros) {
        this.cuadros = cuadros;
    }

    @Override
    public String toString() {
        return "\n Sala:\n Sillones: " + Listar(sillones) + 
                "\n Cuadros: " + Listar(cuadros);
    }
    static String Listar (ArrayList<String> lista){
        String s=""; 
        for (String t : lista) {
           
            s += " "+t+"\n"; 
            
        }
        return s;
    }
    
}

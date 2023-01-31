
package clase20230130;

import java.awt.Color;

public class Cama {
    private String marca, tamaño;
    private Color color;
    public Cama() {
    }

    public Cama(String marca, String tamaño, Color color) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\n Cama:\n Marca: " + marca + 
                "\n Tamaño: " + tamaño + 
                "\n Color: " + color;
    }
    
    
}

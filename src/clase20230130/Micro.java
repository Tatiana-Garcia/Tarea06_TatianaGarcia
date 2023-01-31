
package clase20230130;

public class Micro {
    private String marca;
    private double potencia; 
    
    public Micro(){}

    public Micro(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "\n Micro:\n Marca: " + marca + 
                "\n Potencia=" + potencia;
    }
    
}

public class Lavadora extends Electrodomestico {
    double precio;

    boolean aguaCaliente;

    public Lavadora(String marca, double potencia) {
        super(marca, potencia);
        this.aguaCaliente = false;
    }

    public Lavadora(String marca, double potencia, double precio, boolean aguaCaliente) {
        super(marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }

    public double getConsumo(int horas) {
        if (this.aguaCaliente == false) {
            return horas * this.potencia;
        } else {
            return horas * (this.potencia + this.potencia * 0.2);
        }
    }
}

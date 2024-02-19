// de las clases abstractas NO se pueden crear objetos
public abstract class Electrodomestico {
    //por defecto son protected, no hace falta ponerlo
    protected String tipo;

    String marca;

    double potencia;

    public Electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public Electrodomestico(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }


    //metodo abstracto --> solo se define, no tiene codigo
    public abstract double getConsumo(int horas);

    public double getCosteConsumo(int horas, double costeHora){
        return horas * costeHora;
    }

}

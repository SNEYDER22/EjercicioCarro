package negocio;

public class Carro {



    public Carro() {
    }

    public Carro(int potencia, double velocidad) {
        this.potencia = potencia;
        this.velocidad = velocidad;
    }


    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    int potencia;
    double velocidad;

    void acelerar() {
        velocidad += potencia;
    }

    void frenar() {
        velocidad /= 2;
    }

}

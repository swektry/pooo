package Model;

public class Operador extends Funcionario{
    private double valorHora;

    public Operador(String telefonista, int i) {
        super();
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}

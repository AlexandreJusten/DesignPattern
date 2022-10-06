package strategy;

public class Fiador extends Pessoa implements Desconto {

    private double valor;

    public Fiador(String nome,double valor) {
        super(nome);
        this.valor=valor;
    }

    @Override
    public double calcular() {
        return this.valor * 0.02;
    }
}

package strategy;

public class Locador extends Pessoa implements Desconto {

    private double valor;

    public Locador(String nome,double valor) {
        super(nome);
        this.valor=valor;
    }

    @Override
    public double calcular() {
        return this.valor * 0.05;
    }
}

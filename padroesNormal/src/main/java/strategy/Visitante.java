package strategy;

public class Visitante  extends Pessoa implements Desconto{

    private double valor;

    public Visitante(String nome,double valor) {
        super(nome);
        this.valor=valor;
    }

    @Override
    public double calcular() {
        return this.valor * 0;
    }
}

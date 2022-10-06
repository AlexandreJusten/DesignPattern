package hook;

public class LivroNormal extends Livro{

    public LivroNormal(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    protected double calcularLucroDependente() {
        return getValor()+0.2;
    }

    @Override
    public String getCategoria() {
        return null;
    }


}

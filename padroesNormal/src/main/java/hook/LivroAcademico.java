package hook;

public class LivroAcademico extends Livro{

    public LivroAcademico(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    protected double calcularLucroDependente() {
        return this.getValor()*0.4;
    }

    @Override
    public String getCategoria() {
        return null;
    }
}

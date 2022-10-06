package nullObject;

import hook.Livro;

public class CategoriasLivros extends Livro {

    public CategoriasLivros(String nome, double valor,String categoria) {
        super(nome, valor);
        this.categoria=categoria;
    }

    @Override
    protected double calcularLucroDependente() {
        return 0;
    }

    @Override
    public String getCategoria() {
        return this.categoria;
    }
}

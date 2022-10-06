package nullObject;

import hook.Livro;

public class NullCategoria extends Livro {
    public NullCategoria(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    protected double calcularLucroDependente() {
        return 0;
    }

    @Override
    public String getCategoria() {
        return "Essa categoria não existe";
    }
}

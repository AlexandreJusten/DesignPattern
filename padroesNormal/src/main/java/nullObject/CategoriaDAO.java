package nullObject;

import hook.Livro;

public class CategoriaDAO {

    public static final String[] categorias = { "Ficção", "Romance", "Aventura" };

    public static Livro getCustomer(String nome, double valor,String categoria) {
        for (int i = 0; i < categorias.length; i++)
            if (categorias[i].equalsIgnoreCase(categoria))
                return new CategoriasLivros(nome,valor,categoria);

        return new NullCategoria(nome,valor);
    }
}

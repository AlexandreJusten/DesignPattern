package state;

import hook.Livro;

public class Disponivel implements Estado{


    @Override
    public void acao(Verificador verificador) {
        System.out.println("Esse livro esta disponivel");
        verificador.setEstado(this);
    }
}

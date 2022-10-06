package state;

import hook.Livro;

public class Verificador {

    private Estado estado;

    public Verificador(){
        estado=null;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}

package state;

public class Vendido implements Estado {

    @Override
    public void acao(Verificador verificador) {
        System.out.println("Esse livro ja foi vendido");
        verificador.setEstado(this);
    }
}

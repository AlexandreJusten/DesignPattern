package state;

public class StateController {

    public static void controllerState() {

        Verificador verificador = new Verificador();

        Disponivel disponivel = new Disponivel();
        Vendido vendido = new Vendido();


        disponivel.acao(verificador);
        disponivel.acao(verificador);

        vendido.acao(verificador);
    }

}

package observer;

public interface Observador {
	public void notificar(Observavel observavel, String mensagem);
}

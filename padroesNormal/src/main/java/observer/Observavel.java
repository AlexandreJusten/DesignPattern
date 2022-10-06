package observer;

public interface Observavel {

	public void addObservador(Observador observador);

	public void removeObservador(Observador observador);

	public void notificar(String mensagem);

}

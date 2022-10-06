package observer;

import java.util.ArrayList;
import java.util.List;

public class Servico implements Observavel {
	private String nome;
	private List<Observador> observadores;

	public Servico(String nome) {
		super();
		this.nome = nome;
	}

	public void addObservador(Observador observador) {
		getObservadores().add(observador);
	}

	public void removeObservador(Observador observador) {
		getObservadores().remove(observador);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private List<Observador> getObservadores() {
		if (observadores == null)
			this.observadores = new ArrayList<Observador>();
		return observadores;
	}

	@Override
	public String toString() {
		return nome;
	}

	public void notificar(String mensagem) {
		for (Observador o : observadores)
			o.notificar(this, mensagem);
	}
}

package hook;


import observer.Observador;
import observer.Observavel;

public abstract class Livro implements Observador {

    private String nome;
    private double valor;

    protected String categoria;

    public Livro(String nome, double valor) {
        super();
        this.nome = nome;
        this.valor = valor;
    }
    public void notificar(Observavel observavel, String mensagem) {
        System.out.println(nome + " recebeu a seguinte notificação do " + observavel + ": " + mensagem);
    }

    public double calcularLucroTotal() {
        return calcularLucroDependente() *0.2;
    }

    protected abstract double calcularLucroDependente();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract String getCategoria();
}

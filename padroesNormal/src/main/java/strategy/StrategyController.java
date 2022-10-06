package strategy;

public class StrategyController {

  public static void controllerStrategy(){

      CalcularDesconto calcularDesconto = new CalcularDesconto();
      Fiador fiador = new Fiador("João Fiador",250);
      Locador locador = new Locador("Pedro Locador",250);
      Visitante visitante = new Visitante("Carlos Visitante",250);

      System.out.println("O "+fiador.getNome()+" tem desconto de : R$"+calcularDesconto.calcular(fiador)+" na compra de qualquer livro");
      System.out.println("O "+locador.getNome()+" tem desconto de : R$"+calcularDesconto.calcular(locador)+" na compra de qualquer livro");
      System.out.println("O "+visitante.getNome()+" tem desconto de : R$"+calcularDesconto.calcular(visitante)+" na compra de qualquer livro");
  }
}

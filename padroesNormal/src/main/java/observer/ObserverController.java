package observer;

import hook.Livro;
import hook.LivroAcademico;
import hook.LivroNormal;
import nullObject.CategoriaDAO;

public class ObserverController {

  public static void controllerObserver(){
      Servico secretaria = new Servico("Secretaria");
      Servico clientes = new Servico("Clientes");

//      Livro livroAcademico = new LivroAcademico("LivroAcademico",250);
//      Livro livroNormal = new LivroNormal("LivroNormal",250);

      Livro l1 = CategoriaDAO.getCustomer("livro1",250,"Ficção");
      Livro l2 = CategoriaDAO.getCustomer("livro2",250,"Romance");


      secretaria.addObservador(l1);
      clientes.addObservador(l2);

      secretaria.notificar("Você esta a venda a Muito a tempo e ninguem esta visualizando você!!É melhor remover você\n");

      clientes.notificar("Prazer eu sou um Cliente e estou visualizando esse livro");
  }
}

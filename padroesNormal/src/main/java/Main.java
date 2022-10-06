import hook.HookController;
import nullObject.NullObjectController;
import observer.ObserverController;
import state.StateController;
import strategy.StrategyController;

public class Main {

    public static void main(String[]args){


       //hook-calcula o lucro que o livro vai dar dependente do seu "tipo"
        System.out.println("-----Hook-----");
        HookController.controllerHook();

        //strategy- calcula o desconto dependendo do cargo da Pessoa
        System.out.println("\n-----Strategy-----");
        StrategyController.controllerStrategy();

        //nullObject- verifica se o tipo do livro pode ser cadastrado (ficção,romance,...) ele ultiliza Livro de Hooks porem instância um novo objeto
        System.out.println("\n-----Null Object-----");
        NullObjectController.controllerNullObject();

        //state-verifica se o estado do livro é vendido ou disponivel
        System.out.println("\n-----State-----");
       StateController.controllerState();

        //observer-verifica se o livro esta sendo visualizado e tem chances de ser comprado ultiliza Livro de Hooks porem instância um novo objeto
        System.out.println("\n-----Observe-----");
        ObserverController.controllerObserver();

    }
}

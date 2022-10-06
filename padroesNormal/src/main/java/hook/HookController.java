package hook;

public class HookController {

    public static void controllerHook(){
        Livro l1 = new LivroAcademico("livro1",250);
        Livro l2 = new LivroNormal("livro2",250);

        System.out.println("O lucro do livro " + l1.getNome() + " é " + l1.calcularLucroTotal());
        System.out.println("O lucro do livro " + l2.getNome() + " é " + l2.calcularLucroTotal());
    }
}

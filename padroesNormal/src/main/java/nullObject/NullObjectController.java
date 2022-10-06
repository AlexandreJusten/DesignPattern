package nullObject;

import hook.Livro;

public class NullObjectController {

    public static void controllerNullObject(){
        Livro categoria1 = CategoriaDAO.getCustomer("Livro1",250,"Ficção");
        Livro categoria2 = CategoriaDAO.getCustomer("Livro2",250,"Distopia");
        Livro categoria3 = CategoriaDAO.getCustomer("Livro3",250,"Romance");
        Livro categoria4 = CategoriaDAO.getCustomer("Livro4",250,"Aventura");


        System.out.println("Customers");
        System.out.println(categoria1.getCategoria());
        System.out.println(categoria2.getCategoria());
        System.out.println(categoria3.getCategoria());
        System.out.println(categoria4.getCategoria());


    }
    }


import java.util.Scanner;

import biblioteca.Acervo;
import biblioteca.Livro;

public class App{

    public static void main( String[] args){

        int code, anoPubli, id=0;
        String titulo, autor;
        Scanner input = new Scanner(System.in);
        Acervo acervo = new Acervo();
        Livro livro;

        while(true){

            System.out.println("===Bem vindo à biblioteca do Jãozim===\n");
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Ver detalhes do livro");
            System.out.println("4 - Remover libvro\n");
            System.out.print("-> ");

            code = input.nextInt();
            input.nextLine();

            if(code==0) 
                break;

            if(code == 1){
                System.out.println("Titulo: ");
                titulo = input.nextLine();
                System.out.println("Autor: ");
                autor = input.nextLine();
                System.out.println("Ano de publicação: ");
                anoPubli = input.nextInt();

                livro = new Livro(titulo, autor, anoPubli, id);
                acervo.insereLivro(livro);
            }

            else if(code == 2){
                System.out.println("\n====Livros do acervo====\n");
                int x=1;
                for(Livro l: acervo.getLivros()){
                    System.out.println(x + "-" + l);
                    x++;
                }
                System.out.println("========================\n");
            }

            else if(code == 3){

                break;
            }

            else if(code == 4){

                break;
            }

            id++;
        }
    }
}

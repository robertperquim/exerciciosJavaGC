/*Crie um programa Java que utilize uma estrutura de dados do tipo
TreeMap para criar uma agenda telefônica. Agenda deve conter: número de telefone, nome,
endereço e local da cidade (norte, sul, centro, leste e oeste). Associe nomes a números de telefone e,
em seguida, imprima a lista de contatos em ordem alfabética e imprima os contatos com base na localidade.*/
package aula06.exercicio03;




import java.util.Scanner;
import java.util.TreeMap;

public class exercicio03 {

    public static void main(String[] args) {
        TreeMap<Contato, String> contatos = new TreeMap<>();
        TreeMap<Contato, String> contatosLocalidade = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 4){
            System.out.println("""
                1 - Adicionar contato
                2 - Imprimir nomes
                3 - Contatos por localidades
                4 - Sair
                Escolha uma opcao:
                """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1 -> adicionaContato(contatos, scanner);
                case 2 -> {if(verificaTreeMapaVazio(contatos)){Nomes(contatos);}}
                case 3 ->  {if (verificaTreeMapaVazio(contatos)){contatoPorLocal(contatos, contatosLocalidade);}}
                case 4 -> System.out.println("Fechando programa");
            }

        }
        scanner.close();
    }

    private static void adicionaContato( TreeMap<Contato, String> contatos, Scanner scanner){
        System.out.println("Informe o nome da pessoa que deseja adicionar: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o numero da contato: ");
        String numero = scanner.nextLine();
        System.out.println("Informe a localidade use norte sul leste oeste ");
        String local = scanner.nextLine();


        Contato newContato = new Contato(nome,local);
        contatos.put(newContato, numero);
        System.out.println("Novo contato adicionado.");
    }

    private static void Nomes(TreeMap<Contato, String> contatos){
                contatos.forEach((contato, telefone) -> {
                    System.out.println("Contato: " + contato.getNome() + " Numero " + telefone);});
    }
    private static void contatoPorLocal(TreeMap<Contato, String> contatos, TreeMap<Contato, String> contatosLocalidade){
       listaDeContaosPorLocalidade(contatos,contatosLocalidade);
       contatosLocalidade.forEach((contato, numero) -> {
           System.out.println(contato.getLocal() + " --> " + " Contato: " + contato.getNome() + "Numero: " + numero);
       });
    }
    
    private static void listaDeContaosPorLocalidade(TreeMap<Contato, String> contatos, TreeMap<Contato, String> contatosLocalidade){
       contatos.forEach((contato, numero) -> {
           contato.setOrdemDeOrdenacao(1);
           contatosLocalidade.put(contato, numero);
       });
    }


    private static boolean verificaTreeMapaVazio(TreeMap<Contato, String> contatos){
        if (!contatos.isEmpty()){
            return true;
        }else{
            System.out.println("Arvore vazia");
            return false;
        }
    }

}

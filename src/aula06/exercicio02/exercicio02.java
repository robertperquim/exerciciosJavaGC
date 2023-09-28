/*Crie um programa Java que utilize uma estrutura de dados do tipo HashMap para
associar nomes a idades. Insira algumas entradas no mapa e, em seguida, acesse e
imprima a idade de um nome específico. Crie um método para imprimir nomes das pessoas que
 estão na terceira idade.
Certifique-se de lidar com o caso em que o nome não está presente no mapa.*/

package aula06.exercicio02;
import java.util.HashMap;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        HashMap<String, Integer> mapaPessoas = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 4){
            System.out.println("""
                1 - Adicionar pessoa
                2 - Idade por nome
                3 - Pessoas na terceira idade
                4 - Sair
                Escolha uma opcao:
                """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1 -> adicionaPessoa(mapaPessoas, scanner);
                case 2 -> {if(verificaMapaVazio(mapaPessoas)){idadePorNome(mapaPessoas, scanner);}}
                case 3 ->  {if (verificaMapaVazio(mapaPessoas)){pessoasNaTercairaIdade(mapaPessoas);}}
                case 4 -> System.out.println("Fechando programa");
            }

        }
        scanner.close();
    }

    private static void adicionaPessoa(HashMap<String, Integer> mapaPessoas, Scanner scanner){
        System.out.println("Informe o nome da pessoa que deseja adicionar: ");
        String nome = scanner.nextLine();
        System.out.println("Informe a idade da pessoa: ");
        int idade = scanner.nextInt();

        Pessoa newPessoa = new Pessoa(nome,idade);
        mapaPessoas.put(newPessoa.getNome(),newPessoa.getIdade());
        System.out.println("Nova pessoa adicionada no mapa");
    }

    private static void idadePorNome(HashMap<String, Integer> mapaPessoas, Scanner scanner){
        System.out.println("Informe o nome da pessoa que deseja acessar a idade: ");
        String nome = scanner.nextLine();

         if (mapaPessoas.containsKey(nome)){ // lembrando que String é um objeto
             System.out.println("Idade da pessoa " + nome + " e " + mapaPessoas.get(nome) + " anos.");
         }else{
             System.out.println("Nao existe uma pessoa no mapa com esse nome!");
         }
    }

    private static void pessoasNaTercairaIdade(HashMap<String, Integer> mapaPessoas){

        mapaPessoas.forEach((nome, idade) ->{
            if (idade >= 45 && idade <= 59){
                System.out.println(nome + " esta na terceira idade com " + idade + " anos.");
            }
        });
    }
    private static boolean verificaMapaVazio(HashMap<String, Integer> mapaPessoas){
        if (!mapaPessoas.isEmpty()){
            return true;
        }else{
            System.out.println("Mapa vazio");
            return false;
        }
    }

    
}

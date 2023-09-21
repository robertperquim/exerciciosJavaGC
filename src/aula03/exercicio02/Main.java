package aula03.exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Circulo> circulos = new ArrayList<>();

        int opcao;
        boolean loop = true;

        while (loop) {


            System.out.println("""
                    1 - Cria Ciruclo:
                    2 - Calcular area:
                    3 - Calcular circunferencia:
                    4 - Calcular Diametro:
                    5 - Alterar raio:
                    6 - Dados do circulo:
                    7 - Verificar circulos iguais:
                    8 - Calcular area Sombreada
                    9 - Sair
                    Escolha uma opcao:
                    """);

            opcao = input.nextInt();

            if (opcao == 1){
                int tipo;
                do {
                    System.out.println("""
                                1 - Circulo em cordenadas (0,0)
                                2 - Circulo em cordenadas diferentes
                                """);
                    tipo = input.nextInt();
                } while (tipo < 1 || tipo > 2);

                double raio;
                do {
                    System.out.println("Informe o raio do circulo (positivo)\n");
                    raio = input.nextDouble();
                } while (raio <= 0);

                if (tipo == 1) {
                    Circulo novoCirculo = new Circulo(raio);
                    circulos.add(novoCirculo);


                } else {
                    double x, y;
                    System.out.println("Informe o valor de x: ");
                    x = input.nextDouble();
                    System.out.println("Informe o valor de y: ");
                    y = input.nextDouble();
                    Circulo novoCirculo = new Circulo(raio, x, y);
                    circulos.add(novoCirculo);
                }
                System.out.println("Circulo criado!!");
            }

            if (!circulos.isEmpty()) {

                switch (opcao) {
                    case 2 -> {
                            int indice = Utils.inputIndice(circulos);
                            System.out.printf("\nA area do circulo %d e %.2f\n", indice, circulos.get(indice).calcularArea());
                    }

                    case 3 -> {
                            int indice = Utils.inputIndice(circulos);
                            System.out.printf("\nA circunferencia do circulo %d e %.2f\n", indice, circulos.get(indice).calcularCircunferencia());
                    }
                    case 4 -> {
                            int indice = Utils.inputIndice(circulos);
                            System.out.printf("\nO diametro do circulo %d e %.2f\n", indice, circulos.get(indice).calcularDiametro());

                    }
                    case 5 -> {
                            double raionovo;
                            int indice = Utils.inputIndice(circulos);
                            do {
                                System.out.println("Informe o novo raio do circulo (positivo)");
                                raionovo = input.nextDouble();
                            } while (raionovo <= 0);
                            circulos.get(indice).definirRaio(raionovo);
                            System.out.printf("\nO raio do circulo %d foi alterado para %.2f \n", indice, raionovo);

                    }
                    case 6 -> {
                            int indice = Utils.inputIndice(circulos);
                            System.out.println(circulos.get(indice).toString());
                    }
                    case 7 -> {
                        if (circulos.size() >= 2) {
                            System.out.println("Ciruclo 1:");
                            int indice1 = Utils.inputIndice(circulos);
                            System.out.println("Ciruclo 2:");
                            int indice2 = Utils.inputIndice(circulos);
                            if (circulos.get(indice1).circulosIguais(circulos.get(indice2))) {
                                System.out.println("Circulos Iguais\n");
                            } else {
                                System.out.println("Circulos Diferentes\n");
                            }

                        } else {
                            System.out.println("Voce nao tem o minimo de circulos para verificar\n");
                        }
                    }
                    case 8 -> {
                        if (circulos.size() >= 2) {
                            System.out.println("Ciruclo 1:");
                            int indice1 = Utils.inputIndice(circulos);
                            System.out.println("Ciruclo 2:");
                            int indice2 = Utils.inputIndice(circulos);

                            System.out.println("A area sombreada dos ciruclos e " + circulos.get(indice1).areaSobreada(circulos.get(indice2)));

                        } else {
                            System.out.println("Voce nao tem o minimo de circulos para calcular\n");
                        }
                    }

                }
            }else {
                System.out.println("Circulos insuficientes por favor crie\n");
            }

            if (opcao == 9 ){
                System.out.println("Fechando!!!!");
                loop = false;
            }

            if (opcao <1 || opcao > 9){
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        input.close();
    }

}
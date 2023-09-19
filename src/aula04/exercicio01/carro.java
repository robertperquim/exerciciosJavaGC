package aula04.exercicio01;

public class carro extends Veiculo {
    public carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        return distancia * 0.2;
    }
}


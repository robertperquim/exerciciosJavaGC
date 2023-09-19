package aula04.exercicio01;

public class moto extends Veiculo {
    public moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        return distancia * 0.15;
    }
}

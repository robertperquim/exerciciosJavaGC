package aula03.exercicio02;


public class Circulo {
    private double RaioCirculo;
    private double x;
    private double y;

    public Circulo(double raio) {this.RaioCirculo = raio;}
    public Circulo(double raio, double x, double y) {
        this.RaioCirculo = raio;
        this.x = x;
        this.y = y;
    }
    public double calcularArea(){return Math.pow(RaioCirculo, 2) * Math.PI;}
    public double calcularCircunferencia(){return 2 * Math.PI * RaioCirculo;}
    public double calcularDiametro(){return 2 * RaioCirculo;}
    public void definirRaio(double novoRaio){this.RaioCirculo = novoRaio;}

    public String toString() {
        double area = calcularArea();
        double circunferencia = calcularCircunferencia();
        return String.format("Circulo -> raio %.2f -> Area %.2f -> Circunferencia -> %.2f", RaioCirculo, calcularArea(),calcularCircunferencia());
    }
    public boolean circulosIguais( Circulo circulo2){return this.RaioCirculo == circulo2.RaioCirculo;}

    public double areaSobreada(Circulo circulo2){
        double area1 = this.calcularArea();
        double area2 = circulo2.calcularArea();

        return area1 >= area2 ? area1 - area2 : area2 - area1; //maior menos a menor
    }
}

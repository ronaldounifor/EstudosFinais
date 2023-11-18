public class Circulo {

    private Calculadora calculadora;

    public Circulo(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public double calcularArea(double raio) {

        double area = calculadora.multiplicar(raio, raio);
        area = calculadora.multiplicar(area, 3.14);

        return area;
    }

}
package sorting.ordenacao_comparacao;

public class RaizQuadrada {
    private double raizRecursiva(double value, double error, double esqueda, double direita) {
        double middle = (esqueda + direita) / 2.0;

        if (Math.abs(middle * middle - value) <=  error) {
            return middle;
        }

        if (middle * middle < value) {
            return raizRecursiva(value, error, middle, direita);
        } else {
            return raizRecursiva(value, error, esqueda, middle);
        }
    }

    public double calculaRaix(double value, double error) {
        if (value < 0) {
            throw new RuntimeException();
        }
        double output = raizRecursiva(value, error, 0, value);
        return Math.ceil(output);
    }
}

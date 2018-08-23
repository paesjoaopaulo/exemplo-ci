package paesjoaopaulo.exemplo.ci;

import java.util.ArrayList;

public class Mediana {

    private ArrayList<Integer> vetor;

    public Mediana(ArrayList<Integer> vetor) {
        this.vetor = vetor;
    }

    public double calcular() {
        double el = this.vetor.size();
        double mt = el % 2.0;
        if (mt == 0.0) {
            this.vetor.get(Integer.parseInt(Double.toString(mt)));
        }
    }
}

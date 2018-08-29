package paesjoaopaulo.exemplo.ci;

import java.util.ArrayList;
import java.util.Collections;

public class Vetor {

    private ArrayList<Integer> vetor;

    public Vetor(ArrayList<Integer> vetor) {
        this.vetor = vetor;
    }

    public void ordernar() {
        Collections.sort(vetor);
    }

    public double calcularMediana() {
        this.ordernar();

        int el = this.vetor.size();
        int first = this.vetor.get(0);
        int last = this.vetor.get(el - 1);
        double mediana = (first + last) / 2.0;

        return mediana;
    }
    
    public double calcularMedia(){
        double media = 0;
        return media;
    }
}

package paesjoaopaulo.exemplo.ci;

import java.util.ArrayList;
import java.util.Collections;

public class Vetor {

    private ArrayList<Integer> vetor;

    public Vetor(ArrayList<Integer> vetor) {
        this.vetor = vetor;
    }

    public ArrayList<Integer> ordernar() {
        Collections.sort(vetor);
        return this.vetor;
    }

    public double calcularMediana() {
        this.ordernar();

        int el = this.vetor.size();
        int first = this.vetor.get(0);
        int last = this.vetor.get(el - 1);
        double mediana = (first + last) / 2.0;

        return mediana;
    }

    public double calcularMedia() {

        double soma = 0;
        int tam = this.vetor.size();
        for (int i = 0; i < tam; i++) {
            soma += this.vetor.get(i);
        }
        return soma / tam;
    }
    
    public int getMaiorValor() {
        return this.ordernar().get(this.vetor.size() - 1);
    }
    
    public int getMenorValor() {
        return 0;
    }
}

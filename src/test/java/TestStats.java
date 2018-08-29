
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import paesjoaopaulo.exemplo.ci.Vetor;

public class TestStats {

    @Test
    public void testIs4() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(6);
        array.add(9);
        array.add(-1);
        Vetor m = new Vetor(array);
        assertEquals(m.calcularMediana(), 4.0f, 0.001);
    }

    @Test
    public void testIs39() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(6);
        array.add(9);
        array.add(-1);
        array.add(93);
        array.add(-15);
        array.add(0);
        Vetor m = new Vetor(array);
        assertEquals(m.calcularMediana(), 39.0f, 0.001);
    }

    @Test
    public void testMedia() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(6);
        array.add(9);
        array.add(-1);
        array.add(93);
        array.add(-15);
        array.add(0);
        Vetor m = new Vetor(array);
        assertEquals(m.calcularMedia(), 15.33f, 0.01);
    }

    @Test
    public void testMaiorValor() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(6);
        array.add(9);
        array.add(-1);
        array.add(93);
        array.add(-15);
        array.add(0);
        Vetor m = new Vetor(array);
        assertEquals(m.getMaiorValor(), 93);
    }
    
    @Test
    public void testMenorValor() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(6);
        array.add(9);
        array.add(-1);
        array.add(93);
        array.add(-15);
        array.add(0);
        Vetor m = new Vetor(array);
        assertEquals(m.getMenorValor(), -15);
    }
    
    @Test
    public void testNumValAcimaMedia() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(6);
        array.add(9);
        array.add(-1);
        array.add(93);
        array.add(-15);
        array.add(0);
        Vetor m = new Vetor(array);
        assertEquals(m.getNumValoresAcimaMedia(), 1);
    }

}
